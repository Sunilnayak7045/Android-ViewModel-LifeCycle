package com.example.viewmodellifecycle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class mainViewModelFactory(val counter: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  mainViewModel( counter) as T
    }


}