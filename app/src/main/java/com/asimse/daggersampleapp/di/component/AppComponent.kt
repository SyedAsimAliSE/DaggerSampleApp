package com.asimse.daggersampleapp.di.component

import com.asimse.daggersampleapp.MainApp
import com.asimse.daggersampleapp.di.module.ActivityBindingModule
import com.asimse.daggersampleapp.di.module.AppModule
import com.asimse.daggersampleapp.di.module.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        AppModule::class,
        ViewModelModule::class
    ]
)

@SuppressWarnings
interface AppComponent : AndroidInjector<MainApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApp>()
}
