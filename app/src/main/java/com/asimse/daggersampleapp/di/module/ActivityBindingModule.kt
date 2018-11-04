package com.asimse.daggersampleapp.di.module

import com.asimse.daggersampleapp.ui.MainActivity
import com.asimse.daggersampleapp.di.scope.ActivityScoped
import com.asimse.daggersampleapp.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun mainActivity(): MainActivity

}

