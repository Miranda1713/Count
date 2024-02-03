package com.flagg.msu.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity: AppCompatActivity() {

    private lateinit var tap_button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tap_button = findViewById(R.id.tap_button)
    }

    class Counter {
        private var count: Int = 0
        fun addCount() {
            count++
        }

        fun getCount(): Int {
            return count
        }
    }
    
}    

        
