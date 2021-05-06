package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_add_user:Button = findViewById(R.id.button_add_user)
        val button_list_posts:Button = findViewById(R.id.button_list_posts)
        val button_list_users:Button = findViewById(R.id.button_list_users)
        val crashButton = Button(this)
        crashButton.text = "Crash!"
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

        addContentView(crashButton, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT))

        button_add_user.setOnClickListener{
            val intent = Intent(this, AddUserActivity::class.java)
            startActivity(intent)
        }

        button_list_posts.setOnClickListener{
            val intent = Intent(this, ListPostsActivity::class.java)
            startActivity(intent)
        }

        button_list_users.setOnClickListener{
            val intent = Intent(this, ListUsersActivity::class.java)
            startActivity(intent)
        }
    }


}