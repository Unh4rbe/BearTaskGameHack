package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class T34Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t34)
        var btnext = findViewById<Button>(R.id.btnextT)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textvT)
        textview.text = "По словам медведя, он наиболее вероятно мог оставить балалайку возле танка Т-34, так как он излазил его вдоль и поперек"
        btnext.setOnClickListener {
            if (counter == 0) {
                textview.text =  "- Медведь: ну что, давай посмотрим! "
            }
            if (counter == 1) {
                textview.text = "C переди определенно нет балалайки, может стоит посмотреть сзади?"
            }
            if (counter == 2) {
                textview.text = "- Медведь: Пока мы ищем, я расскажу тебе историю этого танка. Он был великолепным защитником во время Великой Отечественной войны. Стоит отдать честь создателю этого танка, его звали Михаил Ильич Кошкин."
            }
            if (counter == 3) {
                textview.text =  "- Медведь: Еще в месте с ним работал Александр Александрович Морозов"
            }
            if (counter == 4) {
                textview.text = "Вы не видите балалайки, собственно как и причин задерживаться. Вы идете дальше..."
                btnext.text = "Идти"
            }
            if (counter == 5) {
                var gobear = Intent(this@T34Activity, PeresActivity::class.java)
                finish()
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}