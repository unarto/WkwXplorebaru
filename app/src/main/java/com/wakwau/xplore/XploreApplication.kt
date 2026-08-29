package com.wakwau.xplore

import android.app.Application
import com.tencent.mmkv.MMKV
import com.wakwau.xplore.di.AppCompositionRoot

class XploreApplication : Application() {
    lateinit var appCompositionRoot: AppCompositionRoot
        private set

    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
        appCompositionRoot = AppCompositionRoot(this)
    }
}
