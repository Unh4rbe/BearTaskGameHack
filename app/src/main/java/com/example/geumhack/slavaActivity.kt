package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class slavaActivity : StoryActivity(R.layout.activity_slava) {
    override val storyList: List<String> = listOf<String>(
            "Медведь: 9 мая 1971 года на Привокзальной площади, откуда в годы войны барнаульцы уходили на фронт, был открыт Мемориал Славы. Он создан по проектам заслуженного художника и архитектора Петра Миронова и художника-монументалиста Владимира Добровольского.",
            "- Медведь: мемориал включает в себя четыре архитектурных сооружения. Тематический центр первой линии, обращенной к площади, - бронзовая скульптурная группа «Прощание» (фигуры матери и сына) и стела на гранитном постаменте.",
            "У вас осталось 15 минут до занятия, вы говорите об этом расстроеному медведю",
            "Медведь: что же я буду делать без своей балалайки, но коли уж ты помог мне, пошли в твой кванториум, все равно делать нечего",
            "- Медведь: *разачарованно выдыхает*",
            "Следующий пункт назначения - Кванториум",
        )
    override val nextActivity: Class<*>
        get() = OutsideActivity::class.java
}