package com.example.geumhack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.delay

class VictoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)
        var bt1 = findViewById<Button>(R.id.btask)
        var bt2 = findViewById<Button>(R.id.btask2)
        var view = findViewById<TextView>(R.id.taskv)
        var counterT = 0
        var counter = 0
        if (counter == 0) {
            view.text = "Каким переселенцам поставили памятник?"
            bt1.text = "Варварам"
            bt2.text = "Крестьянам"
            bt1.setOnClickListener {
                counter=counter+1
                if (counter == 1) {
                    view.text = "Кто разработал танк Т-34?"
                    bt1.text = "Михаил Ильич Кошников"
                    bt2.text = "Калашников (автомат)"
                    bt1.setOnClickListener {
                        counterT = counterT+1
                        counter=counter+1
                        if (counter == 2) {
                            view.text = "В каком году и какого чила открыли мемориал славы?"
                            bt1.text = "9 мая 1971"
                            bt2.text = "9 марта 1971"
                            bt1.setOnClickListener {
                                counterT = counterT+1
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                            bt2.setOnClickListener {
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                        }
                    }
                    bt2.setOnClickListener {
                        counter=counter+1
                        if (counter == 2) {
                            view.text = "В каком году и какого чила открыли мемориал славы?"
                            bt1.text = "9 мая 1971"
                            bt2.text = "9 марта 1971"
                            bt1.setOnClickListener {
                                counterT = counterT+1
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                            bt2.setOnClickListener {
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bt2.setOnClickListener {
                counterT = counterT + 1
                counter=counter+1
                if (counter == 1) {
                    view.text = "Кто разработал танк Т-34?"
                    bt1.text = "Михаил Ильич Кошников"
                    bt2.text = "Калашников (автомат)"
                    bt1.setOnClickListener {
                        counterT = counterT+1
                        counter=counter+1
                        if (counter == 2) {
                            view.text = "В каком году и какого чила открыли мемориал славы?"
                            bt1.text = "9 мая 1971"
                            bt2.text = "9 марта 1971"
                            bt1.setOnClickListener {
                                counterT = counterT+1
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                            bt2.setOnClickListener {
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                        }
                    }
                    bt2.setOnClickListener {
                        counter=counter+1
                        if (counter == 2) {
                            view.text = "В каком году и какого чила открыли мемориал славы?"
                            bt1.text = "9 мая 1971"
                            bt2.text = "9 марта 1971"
                            bt1.setOnClickListener {
                                counterT = counterT+1
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                            bt2.setOnClickListener {
                                counter=counter+1
                                if (counter == 3) {
                                    view.text = "Что такое кванториум?"
                                    bt1.text = "Детский технопарк"
                                    bt2.text = "МБОУ СОш"
                                    bt1.setOnClickListener {
                                        counterT = counterT+1
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                    bt2.setOnClickListener {
                                        counter=counter+1
                                        view.text = "Количество правильных ответов - $counterT"
                                        btoff()
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    fun btoff() {
        var bt1 = findViewById<Button>(R.id.btask)
        var bt2 = findViewById<Button>(R.id.btask2)
        bt1.isEnabled = false
        bt2.isEnabled = false
    }
}