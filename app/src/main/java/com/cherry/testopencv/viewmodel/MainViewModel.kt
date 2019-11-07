package com.cherry.testopencv.viewmodel

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class MainViewModel: ViewModel() {

    var user: MutableLiveData<List<String>>? = null

    var nameValue = ObservableField<String>()


    fun changeText(view: View) {
        nameValue.set("I love ${nameValue.get()}")
    }

     class Factory : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel() as T
        }

    }

}