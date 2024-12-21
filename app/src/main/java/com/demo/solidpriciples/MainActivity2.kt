package com.demo.solidpriciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        GlobalScope.launch(Dispatchers.Main){
            getListOfNumbers22()
                .collect {
                    Log.d("Collect1 Numbers - $it","")
                }
        }

        GlobalScope.launch(Dispatchers.Main){
            getListOfNumbers22()
                .collect {
                    delay(2500)
                    Log.d("Collect2 Numbers - $it","")
                }
        }
    }


    private fun getListOfNumbers22(): Flow<Int> {
        val mutableSharedFlow = MutableSharedFlow<Int>()
        GlobalScope.launch {
            val num = listOf<Int>(1, 2, 3, 4, 5)
            num.forEach {
                mutableSharedFlow.emit(it)
                delay(1000)
            }
        }
        return mutableSharedFlow
    }
}