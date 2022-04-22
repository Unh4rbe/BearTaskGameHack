package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameStartActivity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "Вы идете по улице в ваш любимый технопарк Алтайского Края Кванториум...",
            "Вы слышите какой-то звук...",
            "*Басовитый плач*...",
            "Вы решаете подойти на звук",
            "Вы видите медведя...",
            "- Медведь: подойди, помоги мне пожалуйста",
            "Вы решаете подойти и помочь медведю, ведь вы очень хороший человек"
        )
    )

    val btnext: Button by lazy { findViewById<Button>(R.id.btnext) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textv) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_start)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@GameStartActivity, BearActivity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}