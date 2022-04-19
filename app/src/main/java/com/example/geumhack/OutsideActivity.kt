package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class OutsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outside)
        var btnext = findViewById<Button>(R.id.btnextO)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textvO)
        textview.text = "Вы: Это технопарк Кванториум"
        btnext.setOnClickListener {
            if (counter == 0) {
                textview.text =  "- Медведь: Чем вы тут занимаетесь?"
            }
            if (counter == 1) {
                textview.text = "- Тут есть IT, VR и другие квантумы, мы изучаем программирование и прочее"
            }
            if (counter == 2) {
                textview.text = "- Мы идем на IT квантум"
            }
            if (counter == 3) {
                textview.text =  "- Медведь: хорошо, пошли!"
            }
            if (counter == 4) {
                textview.text = "Нужно зайти внутрь"
                btnext.text = "Идти"
            }
            if (counter == 5) {
                var gobear = Intent(this@OutsideActivity, InsideActivity::class.java)
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}