package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_picture4.*
import kotlinx.android.synthetic.main.activity_picture5.*

class picture5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture5)
        button6.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
        button8.setOnClickListener {
            startActivity(Intent(baseContext, picture5::class.java))
        }
    }
}