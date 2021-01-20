package com.example.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlbumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        val backEvent = findViewById<Button>(R.id.buttonBack5)
        backEvent.setOnClickListener{
            val intent = Intent(this, RecordsActivity::class.java)
            startActivity(intent)
        }
    }
}