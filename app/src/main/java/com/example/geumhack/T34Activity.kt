package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class T34Activity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "По словам медведя, он наиболее вероятно мог оставить балалайку возле танка Т-34, так как он излазил его вдоль и поперек",
            "- Медведь: ну что, давай посмотрим!",
            "- Медведь: Пока мы ищем, я расскажу тебе историю этого танка. Он был великолепным защитником во время Великой Отечественной войны. Стоит отдать честь создателю этого танка, его звали Михаил Ильич Кошкин.",
            "- Медведь: Еще в месте с ним работал Александр Александрович Морозов",
            "Вы не видите балалайки, собственно как и причин задерживаться. Вы идете дальше...",
        )
    )
    val btnext: Button by lazy { findViewById<Button>(R.id.btnextT) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textvT) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t34)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@T34Activity, PeresActivity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}