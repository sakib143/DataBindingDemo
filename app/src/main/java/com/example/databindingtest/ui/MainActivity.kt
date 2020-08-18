package com.example.databindingtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingtest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
                .commit()

    }
}