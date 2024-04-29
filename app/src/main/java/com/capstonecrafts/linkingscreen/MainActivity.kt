package com.capstonecrafts.linkingscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subjectList = mutableListOf<Subject>()
        val listView = findViewById<ListView>(R.id.listView)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        addBtn.setOnClickListener{
            val intent = Intent(this, AddSubject::class.java)
            startActivity(intent)
        }



        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // Get the selected student
            val subject = subjectList[position]
            // Create an intent to launch StudentDetailsActivity
            val intent = Intent(this, UpdateSubject::class.java)

            // Pass the student data as an extra
            intent.putExtra("student", subject)

            // Start StudentDetailsActivity
            startActivity(intent)
        }

    }
}