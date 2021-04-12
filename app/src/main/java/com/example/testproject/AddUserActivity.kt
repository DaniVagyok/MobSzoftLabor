package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class AddUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        val button_submit: Button = findViewById(R.id.button_submit)
        button_submit.setOnClickListener {
            finish()
            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
        }
    }
}