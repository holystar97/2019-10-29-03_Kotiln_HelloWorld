package com.tjoeun.a2019_10_29_03kotilnhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       Log.d("코틀린 기초", "Hello World!! ")
        Log.d("코틀린 기초" ,"제 이름은 김민경입니다.")


    }
}
