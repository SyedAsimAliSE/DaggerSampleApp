package com.asimse.daggersampleapp.ui.about

import android.util.Log
import com.asimse.daggersampleapp.di.diutilis.BaseViewModel
import javax.inject.Inject

class AboutViewModel @Inject constructor() : BaseViewModel() {

    init {
        Log.i("AboutViewModel", "Initialized")
    }

}
