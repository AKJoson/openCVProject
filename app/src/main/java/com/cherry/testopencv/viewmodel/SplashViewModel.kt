package com.cherry.testopencv.viewmodel


import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cherry.testopencv.bean.UserInfo

class SplashViewModel : ViewModel() {


    val timeValue = ObservableField<String>()

    fun checkUsers(userbean: UserInfo): Boolean {
        return !userbean.token.isNullOrEmpty()
    }

    fun startTimeDown(){
        timeValue.set("${10}s")
    }

    class SplashFractory : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return SplashViewModel() as T
        }

    }
}
