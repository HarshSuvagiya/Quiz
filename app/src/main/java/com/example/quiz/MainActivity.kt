package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val name: String ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this,getString(R.string.enter_name),Toast.LENGTH_LONG).show()
            }
            else{
                startActivity(Intent(this@MainActivity,QuizActivity::class.java).putExtra("name",et_name.text.toString()))
                et_name.text!!.clear()
            }
        }
    }
}
