package com.asimse.daggersampleapp.di.module

import android.content.ClipboardManager
import android.content.Context
import android.net.wifi.WifiManager
import com.asimse.daggersampleapp.MainApp
import dagger.Module
import dagger.Provides

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 *
 * Defines all the classes that need to be provided in the scope of the app.
 */

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApp): Context {
        return application.applicationContext
    }

    @Provides
    fun provideWifiManager(context: Context): WifiManager =
            context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

    @Provides
    fun providesClipboardManager(context: Context): ClipboardManager =
            context.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

}

