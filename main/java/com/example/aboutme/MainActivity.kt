package com.example.aboutme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutEvent = findViewById<Button>(R.id.buttonAbout)
        aboutEvent.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        val hobbyEvent = findViewById<Button>(R.id.buttonHobby)
        hobbyEvent.setOnClickListener{
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }

        val picturesEvent = findViewById<Button>(R.id.buttonPictures)
        picturesEvent.setOnClickListener{
            val intent = Intent(this, PicturesActivity::class.java)
            startActivity(intent)
        }

        val recordsEvent = findViewById<Button>(R.id.buttonRecords)
        recordsEvent.setOnClickListener{
            val intent = Intent(this, RecordsActivity::class.java)
            startActivity(intent)
        }
    }
}