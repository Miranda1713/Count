package com.flagg.msu.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity: AppCompatActivity() {
    private lateinit var tap_button: Button
    private lateinit var tap_count: TextView
    private val count = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tap_button = findViewById(R.id.tap_button)
        tap_count = findViewById(R.id.tap_count)

        tap_button.setOnClickListener {
            count.addCount()
            tap_count.text = count.getCount().toString()
        }
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









        
