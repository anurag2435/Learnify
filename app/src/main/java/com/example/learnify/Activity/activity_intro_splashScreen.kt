package com.example.learnify.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.learnify.R

class activity_intro_splashScreen : AppCompatActivity() {

   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_splash_screen)

        val startbtn: ImageView = findViewById(R.id.startbtn)
        startbtn.setOnClickListener {
            startActivity(Intent(this@activity_intro_splashScreen, MainActivity::class.java))
        }
    }

}