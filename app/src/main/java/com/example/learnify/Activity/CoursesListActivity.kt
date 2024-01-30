package com.example.learnify.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnify.Adapter.CoursesAdapter
import com.example.learnify.Domain.CoursesDomain
import com.example.learnify.R

class CoursesListActivity : AppCompatActivity() {
    private lateinit var adapterCourseList: RecyclerView.Adapter<*>
    private lateinit var recyclerViewCourse: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_list)
        val backtoMainBtn:ConstraintLayout = findViewById(R.id.backtoMainbtn)
        backtoMainBtn.setOnClickListener{
            startActivity(Intent(this@CoursesListActivity, MainActivity::class.java))
        }
        initRecyclerView()
    }
    private fun initRecyclerView() {
        val items = ArrayList<CoursesDomain>()
        items.add(CoursesDomain("Advance Certification In AI",0 ,"ic_1"))
        items.add(CoursesDomain("Google Cloud Platform Architecture",0 ,"ic_2"))
        items.add(CoursesDomain("Fundamental Of Java Programming",0 ,"ic_3"))
        items.add(CoursesDomain("Introduction to UI design History",0,"ic_4"))
        items.add(CoursesDomain("PG Program In Big Data Engineering",0,"ic_5"))

        recyclerViewCourse = findViewById(R.id.view)
        recyclerViewCourse.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))

        adapterCourseList = CoursesAdapter(items)
        recyclerViewCourse.setAdapter(adapterCourseList)
    }
}