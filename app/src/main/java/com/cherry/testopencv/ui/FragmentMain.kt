package com.cherry.testopencv.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cherry.testopencv.R
import com.cherry.testopencv.databinding.FragmentMainBinding
import com.cherry.testopencv.viewmodel.MainViewModel

class FragmentMain : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val mainViewMdoel = ViewModelProvider(this, MainViewModel.Factory()).get(MainViewModel::class.java)
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false)
        binding.viewModel = mainViewMdoel
        return binding.root
    }
}
