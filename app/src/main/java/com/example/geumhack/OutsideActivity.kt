package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class OutsideActivity : StoryActivity(R.layout.activity_outside) {
    override val storyList: List<String> = listOf<String>(
            "Вы: Это технопарк Кванториум",
            "- Тут есть IT, VR и другие квантумы, мы изучаем программирование и прочее",
            "- Мы идем на IT квантум",
            "- Медведь: хорошо, пошли!",
            "Нужно зайти внутрь",
        )
    override val nextActivity: Class<*>
        get() = InsideActivity::class.java
}