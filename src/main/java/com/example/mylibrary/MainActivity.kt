package com.example.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
        }

    }
}