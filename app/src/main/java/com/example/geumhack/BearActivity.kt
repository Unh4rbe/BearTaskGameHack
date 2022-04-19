package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bear)
        var btnext = findViewById<Button>(R.id.btnextB)
        var counter = 0
        var textview = findViewById<TextView>(R.id.textvB)
        textview.text = "Вы подошли к Медведю, и спросили, что же случилось?"
        btnext.setOnClickListener {
            if(counter == 0) {
                textview.text = "- Медведь: Привет, я потерял свою балалайку, и никто мне не поможет, помоги ты!"
            }
            if(counter == 1) {
                textview.text = "Вы не можете отказать медведю, и принимаете его предложение, все равно до занятия еще 2 часа"
            }
            if(counter == 2) {
                textview.text = "- Медведь: Спасибо тебе, я знал что хоть кто-то мне поможет. Понимаешь, я не местный и..."
            }
            if(counter == 3) {
                textview.text = "- Медведь: приехал в Барнаул из села, я рассматривал памятники Барнаула, и где-то потерял балалайку"
            }
            if(counter == 4) {
                textview.text = "Вы идете с медведем искать его балалайку..."
                btnext.text = "Идти"
            }
            if(counter == 5) {
                var gobear = Intent(this@BearActivity, T34Activity::class.java)
                startActivity(gobear)
            }
            counter = counter + 1
        }
    }
}