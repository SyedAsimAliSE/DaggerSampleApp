package com.asimse.daggersampleapp.di.module

import androidx.lifecycle.ViewModelProvider
import com.asimse.daggersampleapp.di.diutilis.MyViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory
}

