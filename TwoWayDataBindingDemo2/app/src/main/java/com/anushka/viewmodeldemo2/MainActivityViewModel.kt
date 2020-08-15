package com.anushka.viewmodeldemo2

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel(), Observable {
     private var total = MutableLiveData<Int>()
     val totalData : LiveData<Int>
     get() = total

    @Bindable
    val inputString = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal(){
        inputString.value?.let {
            val inputInt = it.toInt()
            total.value = (total.value)?.plus(inputInt)
        }
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}