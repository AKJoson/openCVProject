package com.cherry.testopencv

import android.app.Activity
import android.view.View
import androidx.databinding.ObservableField

open class MainViewModel(private val name: String, private val activity: Activity) {

    var nameValue = ObservableField<String>()

    init {
        nameValue.set(name)
    }


    fun changeText(view: View) {
        nameValue.set("I love ${nameValue.get()}")
    }

}