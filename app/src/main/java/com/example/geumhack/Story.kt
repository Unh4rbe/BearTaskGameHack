package com.example.geumhack

import android.widget.Button
import android.widget.TextView

class Story(
     val textview : TextView,
    val btnext : Button,
    var mas : List<String> = listOf()
){
    var currentMessage = 0

    fun updateMessage() : Boolean {
        if (currentMessage == mas.lastIndex){
            if (mas[mas.lastIndex] == "Конец игры")  btnext.text = "Конец"
            else btnext.text = "Идти"
        }
        textview.text = mas.getOrNull(currentMessage) ?: return false
        currentMessage++
        return true
    }
}