package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class InsideActivity : StoryActivity(R.layout.activity_inside) {
    override val storyList: List<String> = listOf<String>(
            "Вы: Вот мой квантум",
            "Учитель: Медведь, это же ты!",
            "- Медведь: о я тебя помню! Мы говорили с тобой про памятники вчера!",
            "- Учитель: да, ты забыл свою балалайку!",
            "Учитель вернул медведю балалайку, а у вас прошел замечательный урок в нашем технопарке. Спасибо за прохождение игры!",
            "Конец игры"
        )
    override val nextActivity: Class<*>
        get() = MainActivity::class.java }