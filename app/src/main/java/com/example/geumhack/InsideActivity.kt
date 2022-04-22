package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class InsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)
        var btnext = findViewById<Button>(R.id.btnextO)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textvO)
        textview.text = "Вы: Вот мой квантум"
        btnext.setOnClickListener {
            if (counter == 0) textview.text =  "- Учитель: Медведь, это же ты!"
            if (counter == 1) textview.text = "- Медведь: о я тебя помню! Мы говорили с тобой про памятники вчера!"
            if (counter == 2) textview.text = "- Учитель: да, ты забыл свою балалайку!"
            if (counter == 3) textview.text =  "Учитель вернул медведю балалайку, а у вас прошел замечательный урок в нашем технопарке. Спасибо за прохождение игры!"
            if (counter == 4) {
                textview.text = "Конец игры"
                btnext.text = "Закончить"
            }
            if (counter == 5) {
                var gobear = Intent(this@InsideActivity, MainActivity::class.java)
                finish()
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}