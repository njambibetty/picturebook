package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_picturetwo.*

class picturetwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picturetwo)

        button3.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
    }
}