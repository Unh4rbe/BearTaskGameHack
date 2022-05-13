package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class PeresActivity : StoryActivity(R.layout.activity_peres) {
    override val storyList: List<String> = listOf<String>(
            "Вторым местом что вы решили посетить был памятник переселенцам",
            "- Медведь: когда то давно, крестьяне переселялись на Алтай! Благодаря им Алтайский край разросся, и стал тем что мы знаем сейчас",
            "- Вы не видите балалайки, осмотритесь по сторонам",
            "Балалайки нигде нет, до вашего урока остался 1 час, вам следует ускорится",
            "- Медведь: *разачарованно выдыхает*",
            "Следующий пункт назначения - Площадь победы, Мемориал Славы",
        )

    override val nextActivity: Class<*>
        get() = slavaActivity::class.java }