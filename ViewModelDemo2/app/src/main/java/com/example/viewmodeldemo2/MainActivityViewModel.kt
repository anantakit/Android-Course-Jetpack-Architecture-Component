package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var result = 0

    fun getResult(): Int {
        return result
    }

    fun sum(input: Int): Int {
        result += input
        return result
    }
}