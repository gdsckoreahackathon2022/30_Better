package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        //award페이지로 이동하기 위한 인덴트 생성
        val awardIntent = Intent(this, award::class.java)
        val awardButton: Button = findViewById(R.id.awardButton)
        awardButton.setOnClickListener {
            startActivity(awardIntent)
        }
    }
}