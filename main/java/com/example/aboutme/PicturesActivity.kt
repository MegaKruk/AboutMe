package com.example.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PicturesActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pictures)

        val backEvent = findViewById<Button>(R.id.buttonBack2)
        backEvent.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val catEvent = findViewById<ImageView>(R.id.imageViewCat0)
        catEvent.setOnClickListener{
            val intent = Intent(this, CatActivity::class.java)
            startActivity(intent)
        }
    }
}