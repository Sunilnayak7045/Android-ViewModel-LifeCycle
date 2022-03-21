package com.example.viewmodellifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    lateinit var txtcounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtcounter = findViewById(R.id.textView_counter)
        setText()
    }
    fun increment(v: View) {
        count++
        setText()

    }

    fun setText() {
        txtcounter.text=count.toString()
    }

}