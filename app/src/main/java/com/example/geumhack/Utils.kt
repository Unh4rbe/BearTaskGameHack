package com.example.geumhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.goTo(story: Story, cls: Class<*>) {
    story.btnext.setOnClickListener {
        if (story.updateMessage().not()) {
            val intent = Intent(this, cls)
            finish()
            startActivity(intent)
        }
    }
}