package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btstart = findViewById<Button>(R.id.btstart)
        var btdev = findViewById<Button>(R.id.btdev)
        var btinfo = findViewById<Button>(R.id.btinfo)
        btstart.setOnClickListener {
            //starts a game
        }
        btdev.setOnClickListener {
            var godev = Intent(this@MainActivity, developers::class.java)
            startActivity(godev)
        }
        btinfo.setOnClickListener {
            var goinfo = Intent(this@MainActivity, InfoActivity::class.java)
            startActivity(goinfo)
        }
    }
}