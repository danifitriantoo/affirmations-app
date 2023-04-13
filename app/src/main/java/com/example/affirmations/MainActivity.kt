package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvAffirmation: TextView = findViewById(R.id.tv_affirmation)
        tvAffirmation.text = DataSource().loadAffirmations().size.toString()
    }
}