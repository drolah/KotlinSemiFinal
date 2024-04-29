package com.capstonecrafts.linkingscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class AddSubject : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_subject)

        var edpCode = findViewById<EditText>(R.id.edpCode)
        var courseName = findViewById<EditText>(R.id.courseName)
        var grade = findViewById<EditText>(R.id.grade)

        var saveBtn = findViewById<Button>(R.id.saveBtn)

        var cancelBtn = findViewById<ImageView>(R.id.cancelBtn)
        cancelBtn.setOnClickListener{
            onBackPressed()
        }
    }
}