package com.luthfihariz.koindemo

import android.app.Application
import com.luthfihariz.koindemo.di.appModule
import org.koin.android.ext.android.startKoin
import org.koin.android.logger.AndroidLogger

class KoinDemoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, arrayListOf(appModule))
    }
}