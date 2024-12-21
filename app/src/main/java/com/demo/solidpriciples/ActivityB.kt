package com.demo.solidpriciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("ActivityB","OnCreated Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityB","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityB","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityB","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityB","onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityB","onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityB","onDestroy Called")
    }
}