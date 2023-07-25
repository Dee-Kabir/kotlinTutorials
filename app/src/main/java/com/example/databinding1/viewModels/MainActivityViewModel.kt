package com.example.databinding1.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
//    private var count = 0
    private var _count:MutableLiveData<Int> = MutableLiveData()
    val count:LiveData<Int>
        get() = _count

    init {
        _count.value = 0
    }
//    adding live data
//    fun getCurrentCount():Int{
//        return count
//    }

    fun getUpdatedCount(){
        _count.postValue(count.value?.plus(1))
    }
}