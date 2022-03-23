package com.example.viewmodellifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtcounter: TextView
    lateinit var mainviewmodel: mainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mainViewModelFactory changes
        mainviewmodel= ViewModelProvider(this, mainViewModelFactory(10)).get(mainViewModel::class.java)

        txtcounter = findViewById(R.id.textView_counter)
        setText()
    }

    fun setText() {
        txtcounter.text=mainviewmodel.count.toString()
    }

    fun increment(v: View) {
        mainviewmodel.increment()
        setText()

    }
}