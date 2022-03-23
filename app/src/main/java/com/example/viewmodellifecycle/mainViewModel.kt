package com.example.viewmodellifecycle

import androidx.lifecycle.ViewModel

class mainViewModel(val initialvalue: Int): ViewModel() {


     var count: Int = initialvalue

    fun increment() {
        count++

    }
}