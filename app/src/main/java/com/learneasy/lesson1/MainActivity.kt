package com.learneasy.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addCounterBTN.setOnClickListener {
            addCount()
        }
        counterTV.setOnClickListener{
            addCount()
        }
    }
    fun addCount(){
        counter += 1
        counterTV.text = counter.toString()
    }
}