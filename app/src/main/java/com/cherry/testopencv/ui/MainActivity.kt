package com.cherry.testopencv.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cherry.testopencv.R

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

//        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        // use this ViewModelProvider will cache the ViewModel data , Even though Activity has been destory.
//        // MainViewModel.Factory() this factory you can input some args you want .
//        val viewModel: MainViewModel = ViewModelProvider(this, MainViewModel.Factory()).get(MainViewModel::class.java)
////        val mainViewModel = MainViewModel()
//        binding.viewModel = viewModel
    }

}