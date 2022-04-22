package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class InsideActivity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "Вы: Вот мой квантум",
            "Учитель: Медведь, это же ты!",
            "- Медведь: о я тебя помню! Мы говорили с тобой про памятники вчера!",
            "- Учитель: да, ты забыл свою балалайку!",
            "Учитель вернул медведю балалайку, а у вас прошел замечательный урок в нашем технопарке. Спасибо за прохождение игры!",
            "Конец игры"
        )
    )
    val btnext: Button by lazy { findViewById<Button>(R.id.btnextI) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textvI) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@InsideActivity, MainActivity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}