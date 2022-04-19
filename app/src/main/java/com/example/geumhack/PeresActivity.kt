package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class PeresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peres)
        var btnext = findViewById<Button>(R.id.btnextP)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textvP)
        textview.text = "Вторым местом что вы решили посетить был памятник переселенцам"
        btnext.setOnClickListener {
            if (counter == 0) {
                textview.text =  "- Медведь: когда то давно, крестьяне переселялись на Алтай! Благодаря им Алтайский край разросся, и стал тем что мы знаем сейчас"
            }
            if (counter == 1) {
                textview.text = "- Вы не видите балалайки, осмотритесь по сторонам"
            }
            if (counter == 2) {
                textview.text = "Балалайки нигде нет, до вашего урока остался 1 час, вам следует ускорится"
            }
            if (counter == 3) {
                textview.text =  "- Медведь: *разачарованно выдыхает*"
            }
            if (counter == 4) {
                textview.text = "Следующий пункт назначения - Площадь победы, Мемориал Славы"
                btnext.text = "Идти"
            }
            if (counter == 5) {
                var gobear = Intent(this@PeresActivity, slavaActivity::class.java)
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}