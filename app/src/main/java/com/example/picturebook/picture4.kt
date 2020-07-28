package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_picture3.*
import kotlinx.android.synthetic.main.activity_picture4.*
import kotlinx.android.synthetic.main.activity_picturetwo.*

class picture4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        button6.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
        }
        button7.setOnClickListener {
            val intent = Intent(baseContext, picture5::class.java)
        }
    }
}