package com.capstonecrafts.linkingscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class UpdateSubject : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_subject)

        var updateBtn = findViewById<Button>(R.id.updateBtn)

        var cancelBtn = findViewById<ImageView>(R.id.cancelBtn)
        cancelBtn.setOnClickListener{
            onBackPressed()
        }
    }
}