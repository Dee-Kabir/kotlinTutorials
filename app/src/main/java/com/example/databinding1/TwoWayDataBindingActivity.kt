package com.example.databinding1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding1.databinding.TwoWayDataBindingLayoutBinding
import com.example.databinding1.viewModels.TwoWayBindingViewModel

class TwoWayDataBindingActivity:AppCompatActivity() {
    private lateinit var binding:TwoWayDataBindingLayoutBinding
    private lateinit var viewModel:TwoWayBindingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TwoWayBindingViewModel::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.two_way_data_binding_layout)
        binding.lifecycleOwner = this
        binding.vm = viewModel
    }
}