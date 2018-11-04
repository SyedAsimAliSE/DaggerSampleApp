package com.asimse.daggersampleapp.ui.home

import android.util.Log
import com.asimse.daggersampleapp.di.diutilis.BaseViewModel
import javax.inject.Inject

/**
 * Created by Syed Asim Ali on 04-Nov-18.
 */

class HomeViewModel @Inject constructor() : BaseViewModel() {

    init {
        Log.i("HomeViewModel", "Initialized")
    }

}
