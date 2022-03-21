package com.example.viewmodellifecycle

import androidx.lifecycle.ViewModel

class mainViewModel: ViewModel() {

     var count: Int = 0

    fun increment() {
        count++

    }
}