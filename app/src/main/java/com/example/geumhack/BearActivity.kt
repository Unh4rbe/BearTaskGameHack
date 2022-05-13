package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BearActivity : StoryActivity(R.layout.activity_bear) {
    override val storyList: List<String> = listOf<String>(
            "Вы подошли к Медведю, и спросили, что же случилось?",
            "- Медведь: Привет, я потерял свою балалайку, и никто мне не поможет, помоги ты!",
            "Вы не можете отказать медведю, и принимаете его предложение, все равно до занятия еще 2 часа",
            "- Медведь: Спасибо тебе, я знал что хоть кто-то мне поможет. Понимаешь, я не местный и...",
            "- Медведь: приехал в Барнаул из села, я рассматривал памятники Барнаула, и где-то потерял балалайку",
            "Вы идете с медведем искать его балалайку..."

        )
    override val nextActivity: Class<*>
        get() = T34Activity::class.java
    }