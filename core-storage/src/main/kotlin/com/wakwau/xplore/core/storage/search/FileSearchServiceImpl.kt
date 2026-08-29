package com.wakwau.xplore.core.storage.search

import com.wakwau.xplore.core.storage.db.entity.FileIndexEntity
import com.wakwau.xplore.core.storage.db.repository.FileIndexRepository
import com.wakwau.xplore.core.storage.model.FileItem
import com.wakwau.xplore.core.storage.model.FileType
import com.wakwau.xplore.core.storage.model.StorageLocation
import com.wakwau.xplore.core.storage.model.FileMetadata
import com.wakwau.xplore.core.storage.operation.FileOperationResult
import com.wakwau.xplore.core.storage.repository.DirectoryRepository
import com.wakwau.xplore.core.util.FileCategory
import com.wakwau.xplore.core.util.MimeTypeDetector
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import java.util.Locale

// [Jalur Class]: com.wakwau.xplore.core.storage.search.FileSearchServiceImpl
// [Penjelasan]: Layanan pencarian asinkron hybrid. Melakukan pencarian menggunakan FileSystem Traversal (Deep Search) dan secara inkremental menyimpan hasilnya ke indeks (opsional). Tidak lagi memaksa indeks seluruh root.
class FileSearchServiceImpl(
    private val directoryRepository: DirectoryRepository,
    private val fileIndexRepository: FileIndexRepository,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.IO
) : FileSearchService {

    override fun search(query: FileSearchQuery): Flow<List<FileItem>> = flow {
        val ext = query.extension?.removePrefix(".")?.lowercase(Locale.getDefault())
        val minSize = query.minSize
        val maxSize = query.maxSize
        val keyword = query.keyword.lowercase(Locale.getDefault())

        val queue = ArrayDeque<StorageLocation>()
        queue.add(query.location)
        val batch = mutableListOf<FileItem>()
        val indexBatch = mutableListOf<FileIndexEntity>()

        while (queue.isNotEmpty()) {
            val currentLocation = queue.removeFirst()
            val listResult = directoryRepository.list(currentLocation)
            
            if (listResult is FileOperationResult.Success) {
                for (item in listResult.data) {
                    val isDir = item.type == FileType.DIRECTORY
                    val itemNameLower = item.name.lowercase(Locale.getDefault())
                    val itemExt = item.name.substringAfterLast('.', "").lowercase(Locale.getDefault())
                    
                    if (isDir) {
                        queue.addLast(item.location)
                    }

                    // Filtering
                    var isMatch = true
                    if (keyword.isNotEmpty() && !itemNameLower.contains(keyword)) isMatch = false
                    if (minSize != null && minSize > 0 && item.metadata.size < minSize) isMatch = false
                    if (maxSize != null && maxSize > 0 && item.metadata.size > maxSize) isMatch = false
                    if (!ext.isNullOrBlank() && itemExt != ext) isMatch = false

                    if (isMatch) {
                        batch.add(item)
                        if (batch.size >= 10) {
                            emit(batch.toList())
                            batch.clear()
                        }
                    }

                    // Incremental Background Indexing (Piggyback)
                    val category = MimeTypeDetector.getCategory(item.name, isDir).name
                    indexBatch.add(
                        FileIndexEntity(
                            filePath = item.location.path,
                            fileName = item.name,
                            size = item.metadata.size,
                            extension = itemExt,
                            category = category,
                            dateModified = item.metadata.modifiedTime,
                            isDirectory = isDir
                        )
                    )
                    
                    if (indexBatch.size >= 50) {
                        val toInsert = indexBatch.toList()
                        CoroutineScope(defaultDispatcher).launch {
                            fileIndexRepository.addOrUpdateIndexBatch(toInsert)
                        }
                        indexBatch.clear()
                    }
                }
            }
        }
        
        if (batch.isNotEmpty()) {
            emit(batch.toList())
        }
        if (indexBatch.isNotEmpty()) {
            CoroutineScope(defaultDispatcher).launch {
                fileIndexRepository.addOrUpdateIndexBatch(indexBatch)
            }
        }
    }.flowOn(defaultDispatcher)

    override suspend fun removeIndexByPrefix(locationPrefix: String) {
        fileIndexRepository.removeIndexByPrefix(locationPrefix)
    }

    override suspend fun addOrUpdateIndexBatch(items: List<FileItem>) {
        val indexBatch = items.map { item ->
            val isDir = item.type == FileType.DIRECTORY
            val extension = item.name.substringAfterLast('.', "").lowercase(Locale.getDefault())
            val category = MimeTypeDetector.getCategory(item.name, isDir).name
            
            FileIndexEntity(
                filePath = item.location.path,
                fileName = item.name,
                size = item.metadata.size,
                extension = extension,
                category = category,
                dateModified = item.metadata.modifiedTime,
                isDirectory = isDir
            )
        }
        fileIndexRepository.addOrUpdateIndexBatch(indexBatch)
    }
}
