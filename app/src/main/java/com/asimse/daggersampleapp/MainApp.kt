package com.asimse.daggersampleapp

import com.asimse.daggersampleapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

/**
 * MainApp - add this class to the manifest
 */

class MainApp : DaggerApplication() {

    /**
     * Tell Dagger which [AndroidInjector] to use - in our case
     * [AppComponent]. `DaggerAppComponent`
     * is a class generated by Dagger based on the `AppComponent` class.
     */
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        //You have to rebuild your project to recognize the DaggerAppComponent class generated by Dagger
        return DaggerAppComponent.builder().create(this)
    }
}