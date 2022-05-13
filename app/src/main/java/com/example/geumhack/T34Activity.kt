package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.TextView

class T34Activity : StoryActivity(R.layout.activity_t34) {
    override val storyList: List<String> = listOf<String>(
            "По словам медведя, он наиболее вероятно мог оставить балалайку возле танка Т-34, так как он излазил его вдоль и поперек",
            "- Медведь: ну что, давай посмотрим!",
            "- Медведь: Пока мы ищем, я расскажу тебе историю этого танка. Он был великолепным защитником во время Великой Отечественной войны. Стоит отдать честь создателю этого танка, его звали Михаил Ильич Кошкин.",
            "- Медведь: Еще в месте с ним работал Александр Александрович Морозов",
            "Вы не видите балалайки, собственно как и причин задерживаться. Вы идете дальше...",
        )
    override val nextActivity: Class<*>
        get() = PeresActivity::class.java
}