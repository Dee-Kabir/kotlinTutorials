package com.example.databinding1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding1.databinding.ViewModelTestAcrivityBinding
import com.example.databinding1.viewModels.MainActivityViewModel

class ViewModelTestActivity:AppCompatActivity() {
    private lateinit var binding:ViewModelTestAcrivityBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.view_model_test_acrivity)
//        binding.tvCount.text = viewModel.getCurrentCount().toString()
        binding.vm = viewModel
        viewModel.count.observe(this){
            binding.tvCount.text = it.toString()
        }

    }
}