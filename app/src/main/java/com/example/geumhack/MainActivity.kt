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
        var btvic = findViewById<Button>(R.id.btvic)
        btvic.setOnClickListener {
            var govict = Intent(this@MainActivity, VictoryActivity::class.java)
            startActivity(govict)
        }
        btstart.setOnClickListener {
            var gogame = Intent(this@MainActivity, GameStartActivity::class.java)
            startActivity(gogame)
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