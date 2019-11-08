package com.cherry.testopencv.viewmodel


import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator
import androidx.core.animation.addListener
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class SplashViewModel : ViewModel() {

    val startValue: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val timeValue = ObservableField<String>()

    fun startTimeDown() {
        ValueAnimator().apply {
            //            addUpdateListener(object : ValueAnimator.AnimatorUpdateListener {
//                override fun onAnimationUpdate(animation: ValueAnimator?) {
//                    timeValue.set("${animation?.animatedValue as Int} S")
//                }
//            })
            addUpdateListener { animation ->
                timeValue.set("${animation?.animatedValue as Int} S")
            }
            addListener(onEnd = {
                startValue.value = 1
                timeValue.set("over")
            })
            interpolator = LinearInterpolator()
            setIntValues(5, 1)
            duration = 5 * 1000
            start()
        }
    }

    class SplashFractory : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return SplashViewModel() as T
        }

    }
}
