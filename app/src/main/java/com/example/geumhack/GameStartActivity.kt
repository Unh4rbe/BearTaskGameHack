package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameStartActivity : StoryActivity(R.layout.activity_game_start) {
    override val storyList: List<String> = listOf<String>(
            "Вы идете по улице в ваш любимый технопарк Алтайского Края Кванториум...",
            "Вы слышите какой-то звук...",
            "*Басовитый плач*...",
            "Вы решаете подойти на звук",
            "Вы видите медведя...",
            "- Медведь: подойди, помоги мне пожалуйста",
            "Вы решаете подойти и помочь медведю, ведь вы очень хороший человек"
        )
    override val nextActivity: Class<*>
        get() = BearActivity::class.java
}