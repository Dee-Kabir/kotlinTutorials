package com.example.databinding1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding1.databinding.AddRecursivelyLayoutBinding
import com.example.databinding1.viewModelFactory.MainActivityViewModelFactory
import com.example.databinding1.viewModels.AddRecursivelyViewModel

class AddRecursivelyActivity:AppCompatActivity() {
    private lateinit var binding:AddRecursivelyLayoutBinding
    private lateinit var viewModel:AddRecursivelyViewModel
    private lateinit var viewModelFactory:MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModelFactory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this,viewModelFactory).get(AddRecursivelyViewModel::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.add_recursively_layout)
        viewModel.result.observe(this, Observer {
            binding.tvResult.text = it.toString()
        })
        binding.apply {
//            tvResult.text = viewModel.getCurrentValue().toString()
            btnAdd.setOnClickListener {
                if(editTxt.text.isNotEmpty()) {
                    viewModel.afterAdd(Integer.parseInt(editTxt.text.toString())).toString()
//                    tvResult.text = viewModel.getCurrentValue().toString()
                }
            }
        }
    }
}