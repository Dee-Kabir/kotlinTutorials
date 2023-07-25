package com.example.databinding1.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRecursivelyViewModel(startingResult:Int):ViewModel() {
//    private var result:Int = 0
    private var _result:MutableLiveData<Int> = MutableLiveData()
    val result:LiveData<Int>
        get() = _result

    val num = MutableLiveData<String>()
    init {
        _result.value = startingResult
        num.value = "0"
    }

    fun afterAdd(){
        _result.value= _result.value?.plus(if(num.value.isNullOrEmpty()) 0 else num.value!!.toInt())
    }

    // no need after using live data
//    fun getCurrentValue():Int{
//        return result
//    }
}