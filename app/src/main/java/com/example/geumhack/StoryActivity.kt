package com.example.geumhack

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class StoryActivity(@LayoutRes contentLayoutId:Int) : AppCompatActivity(contentLayoutId){
    abstract val storyList : List<String>
    abstract val nextActivity : Class<*>
    private val story : Story by lazy {
        Story(
            findViewById<TextView>(R.id.textv),
            findViewById<Button>(R.id.btnext),
            storyList
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        story.updateMessage()
        goTo(story, nextActivity)
    }
}