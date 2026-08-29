// [Jalur Class]: com.wakwau.xplore.filemanager.ui.component.SideActionBar
// [Penjelasan]: Menambahkan aksi TOGGLE_HIDDEN ("Tersembunyi") pada side action bar untuk beralih antara menampilkan atau menyembunyikan berkas tersembunyi.
package com.wakwau.xplore.filemanager.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.Sort
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentCut
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wakwau.xplore.core.ui.theme.XPloreTheme
import com.wakwau.xplore.filemanager.ui.state.FileOperationPanelPosition

import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset

import androidx.compose.ui.res.stringResource
import com.wakwau.xplore.filemanager.ui.R

enum class SideAction {
    SWITCH_PANE, UP_DIR, MARK, UNMARK, COPY, MOVE, DELETE, SORT, TOGGLE_HIDDEN, SEARCH
}

@Composable
fun SideActionBar(
    onActionClick: (SideAction) -> Unit,
    position: FileOperationPanelPosition,
    selectedCount: Int = 0,
    showHiddenFiles: Boolean = false,
    modifier: Modifier = Modifier
) {
    val colors = XPloreTheme.colors

    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(60.dp)
            .background(colors.surface)
            .drawBehind {
                val strokeWidth = 1.dp.toPx()
                val color = colors.treeLineColor
                if (position == FileOperationPanelPosition.RIGHT) {
                    drawLine(
                        color = color,
                        start = Offset(0f, 0f),
                        end = Offset(0f, size.height),
                        strokeWidth = strokeWidth
                    )
                } else if (position == FileOperationPanelPosition.LEFT) {
                    drawLine(
                        color = color,
                        start = Offset(size.width, 0f),
                        end = Offset(size.width, size.height),
                        strokeWidth = strokeWidth
                    )
                }
            }
            .verticalScroll(rememberScrollState())
            .padding(vertical = 4.dp, horizontal = 2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Directional Switch Pane Action Button
        val switchIcon = if (position == FileOperationPanelPosition.RIGHT) {
            Icons.AutoMirrored.Filled.ArrowForward
        } else {
            Icons.AutoMirrored.Filled.ArrowBack
        }
        SideActionButton(
            label = "",
            icon = switchIcon,
            tint = colors.secondary
        ) { onActionClick(SideAction.SWITCH_PANE) }

        val copyLabel = if (selectedCount > 0) stringResource(R.string.label_copy_count, selectedCount) else stringResource(R.string.cd_copy)
        val moveLabel = if (selectedCount > 0) stringResource(R.string.label_move_count, selectedCount) else stringResource(R.string.label_move)
        val deleteLabel = if (selectedCount > 0) stringResource(R.string.label_delete_count, selectedCount) else stringResource(R.string.cd_delete)

        SideActionButton(stringResource(R.string.label_up_dir), Icons.Default.ArrowUpward, colors.checkMarkSelected) { onActionClick(SideAction.UP_DIR) }
        
        if (selectedCount > 0) {
            SideActionButton(stringResource(R.string.cd_unmark), androidx.compose.material.icons.Icons.Default.VisibilityOff, colors.primary) { onActionClick(SideAction.UNMARK) }
        } else {
            SideActionButton(stringResource(R.string.cd_mark), androidx.compose.material.icons.Icons.Default.Visibility, colors.textTertiary) { onActionClick(SideAction.MARK) }
        }

        SideActionButton(stringResource(R.string.cd_search), Icons.Default.Search, colors.textTertiary) { onActionClick(SideAction.SEARCH) }

        SideActionButton(copyLabel, Icons.Default.ContentCopy, if (selectedCount > 0) colors.primary else colors.textTertiary) { onActionClick(SideAction.COPY) }
        SideActionButton(moveLabel, Icons.Default.ContentCut, if (selectedCount > 0) colors.primary else colors.textTertiary) { onActionClick(SideAction.MOVE) }
        SideActionButton(deleteLabel, Icons.Default.Delete, MaterialTheme.colorScheme.error) { onActionClick(SideAction.DELETE) }
        SideActionButton(stringResource(R.string.cd_sort_options), Icons.AutoMirrored.Filled.Sort, colors.textTertiary) { onActionClick(SideAction.SORT) }
        
        val hiddenTint = if (showHiddenFiles) colors.primary else colors.textTertiary
        val hiddenIcon = if (showHiddenFiles) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
        SideActionButton(stringResource(R.string.label_show_hidden), hiddenIcon, hiddenTint) { onActionClick(SideAction.TOGGLE_HIDDEN) }
    }
}

@Composable
private fun SideActionButton(
    label: String,
    icon: ImageVector,
    tint: Color,
    onClick: () -> Unit
) {
    val colors = XPloreTheme.colors

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(6.dp))
            .clickable(onClick = onClick)
            .padding(vertical = 5.dp, horizontal = 2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label.ifEmpty { stringResource(R.string.cd_action) },
            tint = tint,
            modifier = Modifier.size(20.dp)
        )
        if (label.isNotEmpty()) {
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = label,
                color = colors.textSecondary,
                fontSize = 8.5.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
