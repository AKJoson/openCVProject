package com.cherry.testopencv.ui

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.cherry.testopencv.R
import com.cherry.testopencv.databinding.FragmentSplashBinding
import com.cherry.testopencv.viewmodel.SplashViewModel

class FragmentSplash : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSplashBinding>(inflater, R.layout.fragment_splash, container, false)
        val viewModel = ViewModelProvider(this, SplashViewModel.SplashFractory()).get(SplashViewModel::class.java)
        binding.viewModel = viewModel
        Handler().postDelayed({
            viewModel.startTimeDown()
        }, 1000)
        subscrible(binding)
        return binding.root
    }

    private fun subscrible(binding: FragmentSplashBinding) {
        val nameObserver = Observer<Int> { newName ->
            // Update the UI, in this case, a TextView.
            if (newName == 1)
                binding.root.findNavController().navigate(R.id.action_in_main_fragment)
        }
        binding.viewModel?.startValue?.observe(viewLifecycleOwner, nameObserver)
    }

}

