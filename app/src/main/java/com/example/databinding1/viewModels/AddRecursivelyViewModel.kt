package com.example.databinding1.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRecursivelyViewModel(startingResult:Int):ViewModel() {
//    private var result:Int = 0
    private var _result:MutableLiveData<Int> = MutableLiveData()
    val result:LiveData<Int>
        get() = _result

    init {
        _result.value = startingResult
    }

    fun afterAdd(num:Int){
        _result.value= _result.value?.plus(num)
    }

    // no need after using live data
//    fun getCurrentValue():Int{
//        return result
//    }
}