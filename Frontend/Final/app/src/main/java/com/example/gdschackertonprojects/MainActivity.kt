package com.example.gdschackertonprojects

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //registration페이지로 이동하기 위한 인덴트 생성
        val registrationIntent = Intent(this, Registration::class.java)
        val nextPageButton: ImageView = findViewById(R.id.startVegetables)
        nextPageButton.setOnClickListener {
            startActivity(registrationIntent)
        }
    }
}