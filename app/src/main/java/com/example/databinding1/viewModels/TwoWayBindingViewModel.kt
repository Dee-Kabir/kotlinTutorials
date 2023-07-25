package com.example.databinding1.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayBindingViewModel:ViewModel() {
    var name = MutableLiveData<String>()

    init {
        name.value = "xyz"
    }
}