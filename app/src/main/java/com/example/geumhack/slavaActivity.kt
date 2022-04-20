package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class slavaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slava)
        var btnext = findViewById<Button>(R.id.btnextMe)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textMe)
        textview.text = "Медведь: 9 мая 1971 года на Привокзальной площади, откуда в годы войны барнаульцы уходили на фронт, был открыт Мемориал Славы. Он создан по проектам заслуженного художника и архитектора Петра Миронова и художника-монументалиста Владимира Добровольского. "
        btnext.setOnClickListener {
            if (counter == 0) {
                textview.text =  "- Медведь: емориал включает в себя четыре архитектурных сооружения. Тематический центр первой линии, обращенной к площади, - бронзовая скульптурная группа «Прощание» (фигуры матери и сына) и стела на гранитном постаменте."
            }
            if (counter == 1) {
                textview.text = "У вас осталось 15 минут до занятия, вы говорите об этом расстроеному медведю"
            }
            if (counter == 2) {
                textview.text = "Медведь: что же я буду делать без своей балалайки, но коли уж ты помог мне, пошли в твой кванториум, все равно делать нечего"
            }
            if (counter == 3) {
                textview.text =  "- Медведь: *разачарованно выдыхает*"
            }
            if (counter == 4) {
                textview.text = "Следующий пункт назначения - Кванториум"
                btnext.text = "Идти"
            }
            if (counter == 5) {
                var gobear = Intent(this@slavaActivity, OutsideActivity::class.java)
                finish()
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}