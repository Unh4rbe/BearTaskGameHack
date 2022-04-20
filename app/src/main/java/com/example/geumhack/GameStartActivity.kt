package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_start)
        var btnext = findViewById<Button>(R.id.btnext)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textv)
        textview.text = "Вы идете по улице в ваш любимый технопарк Алтайского Края Кванториум..."
        btnext.setOnClickListener {
            if(counter == 0) {
                textview.text = "*Басовитый плач*..."
            }
            if(counter == 1) {
                textview.text = "Вы решаете подойти на звук"
            }
            if(counter == 2) {
                textview.text = "Вы видите медведя..."
            }
            if(counter == 3) {
                textview.text = "- Медведь: подойди, помоги мне пожалуйста"
            }
            if(counter == 4) {
                textview.text = "Вы решаете подойти и помочь медведю, ведь вы очень хороший человек"
                btnext.text = "Идти"
            }
            if(counter == 5) {
                var gobear = Intent(this@GameStartActivity, BearActivity::class.java)
                finish()
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}