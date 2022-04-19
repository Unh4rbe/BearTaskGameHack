package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        var gobackbt = findViewById<Button>(R.id.back)
        var goback = Intent(this@InfoActivity, MainActivity::class.java)
        gobackbt.setOnClickListener {
            startActivity(goback)
        }
    }
}