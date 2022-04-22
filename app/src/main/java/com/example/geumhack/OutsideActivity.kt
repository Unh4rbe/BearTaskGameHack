package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class OutsideActivity : AppCompatActivity() {
    val story = Story(
        listOf<String>(
            "Вы: Это технопарк Кванториум",
            "- Тут есть IT, VR и другие квантумы, мы изучаем программирование и прочее",
            "- Мы идем на IT квантум",
            "- Медведь: хорошо, пошли!",
            "Нужно зайти внутрь",
        )
    )
    val btnext: Button by lazy { findViewById<Button>(R.id.btnextO) }
    val textview: TextView by lazy { findViewById<TextView>(R.id.textvO) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outside)
        story.updateMessage(textview, btnext)
        btnext.setOnClickListener {
            if (story.updateMessage(textview, btnext).not()) {
                var gobear = Intent(this@OutsideActivity, InsideActivity::class.java)
                finish()
                startActivity(gobear)
            }
        }
    }
}