package com.example.jitpack_lib_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.loanlib.sumLoan

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.e("MainActivity2", sumLoan(2, 3).toString())

    }
}