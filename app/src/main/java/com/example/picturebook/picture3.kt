package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_picture3.*
import kotlinx.android.synthetic.main.activity_picturetwo.*

class picture3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        button4.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
        }
        button5.setOnClickListener {
            val intent = Intent(baseContext, picture4::class.java)
        }
    }

}