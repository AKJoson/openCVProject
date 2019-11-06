package com.cherry.testopencv.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.cherry.testopencv.MainViewModel
import com.cherry.testopencv.R
import com.cherry.testopencv.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = MainViewModel("Hi Sam", this)
    }
}