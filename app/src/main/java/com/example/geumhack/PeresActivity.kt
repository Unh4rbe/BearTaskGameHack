package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class PeresActivity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "Вторым местом что вы решили посетить был памятник переселенцам",
            "- Медведь: когда то давно, крестьяне переселялись на Алтай! Благодаря им Алтайский край разросся, и стал тем что мы знаем сейчас",
            "- Вы не видите балалайки, осмотритесь по сторонам",
            "Балалайки нигде нет, до вашего урока остался 1 час, вам следует ускорится",
            "- Медведь: *разачарованно выдыхает*",
            "Следующий пункт назначения - Площадь победы, Мемориал Славы",
        )
    )
    val btnext: Button by lazy { findViewById<Button>(R.id.btnextP) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textvP) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peres)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@PeresActivity, slavaActivity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}