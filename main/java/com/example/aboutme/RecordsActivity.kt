package com.example.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        val backEvent = findViewById<Button>(R.id.buttonBack3)
        backEvent.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val albumEvent = findViewById<ImageView>(R.id.imageViewRecord0)
        albumEvent.setOnClickListener{
            val intent = Intent(this, AlbumActivity::class.java)
            startActivity(intent)
        }
    }
}