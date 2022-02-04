package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Award : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_award)

        //main페이지로 이동하기 위한 인덴트 생성
        val mainIntent = Intent(this, MainPage::class.java)
        val mainButton: Button = findViewById(R.id.toMain)
        mainButton.setOnClickListener {
            startActivity(mainIntent)
        }
    }
}