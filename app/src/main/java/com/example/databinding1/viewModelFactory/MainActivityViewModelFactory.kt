package com.example.databinding1.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.databinding1.viewModels.AddRecursivelyViewModel

class MainActivityViewModelFactory(private val startingResult:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddRecursivelyViewModel::class.java)){
            return AddRecursivelyViewModel(startingResult) as T
        }
        throw Exception("nothing")
    }
}