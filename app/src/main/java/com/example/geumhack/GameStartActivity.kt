package com.example.geumhack

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
        var textview = findViewById<TextView>(R.id.btnext)
        textview.text = "Вы идете по улице в ваш любимый технопарк Алтайского Края Кванториум..."
        btnext.setOnClickListener {
            if(counter == 0) {
                counter = counter + 1
                textview.text = "*Басовитый плач*..."
            }
            if(counter == 1) {
                counter = counter + 1
                textview.text = "Вы решаете подойти на звук"
            }
            if(counter == 2) {
                counter = counter + 1
                textview.text = "Вы видите медведя..."
            }
            if(counter == 3) {
                counter = counter + 1
                textview.text = "- Медведь: подойди, помоги мне пожалуйста"
            }
            if(counter == 4) {
                counter = counter + 1
                textview.text = "Вы решаете подойти и помочь медведю, ведь вы очень хороший хуесос"
            }
            else {
                textview.text = "ФАТАЛЬНАЯ ОШИБКА == ТВОЕ РОЖДЕНИЕ == ЛИШНЯЯ ХРОМОСОМА (TRUE)"
            }
        }
    }
}