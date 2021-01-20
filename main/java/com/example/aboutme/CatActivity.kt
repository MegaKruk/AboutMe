package com.example.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        val backEvent = findViewById<Button>(R.id.buttonBack4)
        backEvent.setOnClickListener{
            val intent = Intent(this, PicturesActivity::class.java)
            startActivity(intent)
        }
    }
}