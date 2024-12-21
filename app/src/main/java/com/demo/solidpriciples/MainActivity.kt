package com.demo.solidpriciples

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
   // var viewmodel:PracticeViewModel = ViewModelProvider(this).get(PracticeViewModel::class.java)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","OnCreated Called")

      /*  val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(applicationContext,ActivityB::class.java)
            startActivity(intent)
        }*/

        val blankFragment:Fragment = BlankFragment()
        val fragment:Fragment? = supportFragmentManager.findFragmentByTag(BlankFragment::class.java.simpleName)

        if (fragment !is BlankFragment){
            supportFragmentManager.beginTransaction().add(R.id.frame_container,blankFragment,BlankFragment::class.java.simpleName).commit()
        }
    }



    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy Called")
    }
}