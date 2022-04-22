package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BearActivity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "Вы подошли к Медведю, и спросили, что же случилось?",
            "- Медведь: Привет, я потерял свою балалайку, и никто мне не поможет, помоги ты!",
            "Вы не можете отказать медведю, и принимаете его предложение, все равно до занятия еще 2 часа",
            "- Медведь: Спасибо тебе, я знал что хоть кто-то мне поможет. Понимаешь, я не местный и...",
            "- Медведь: приехал в Барнаул из села, я рассматривал памятники Барнаула, и где-то потерял балалайку",
            "Вы идете с медведем искать его балалайку..."
        )
    )
    val btnext: Button by lazy { findViewById<Button>(R.id.btnextB) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textvB) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bear)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@BearActivity, T34Activity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}