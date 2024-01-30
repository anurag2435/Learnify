package com.example.learnify.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.learnify.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: ConstraintLayout = findViewById(R.id.butn1)
        btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity, CoursesListActivity::class.java))
        }
    }
}