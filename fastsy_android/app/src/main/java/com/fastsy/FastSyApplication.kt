package com.fastsy

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FastSyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@FastSyApplication)
        }
    }
}