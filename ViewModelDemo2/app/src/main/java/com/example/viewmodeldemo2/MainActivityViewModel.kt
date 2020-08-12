package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }

    fun getResult(): Int {
        return total
    }

    fun sum(input: Int): Int {
        total += input
        return total
    }
}