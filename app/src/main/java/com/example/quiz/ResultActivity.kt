package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    var name: String ?= null
    var correct: Int ?= null
    var total: Int ?= null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        name = intent.getStringExtra("name")
        correct = intent.getIntExtra("correct",0)
        total = intent.getIntExtra("total",0)

        tv_name.text = name
        tv_score.text = "Your score is $correct out of $total"
        btn_finish.setOnClickListener {
            finish()
        }

    }
}
