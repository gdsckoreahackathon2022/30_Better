package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration2)

        //registration1페이지로 이동하기 위한 인덴트 생성
        val previousStepIntent = Intent(this, Registration::class.java)
        val previousButton: Button = findViewById(R.id.previousStep3)
        previousButton.setOnClickListener {
            startActivity(previousStepIntent)
        }
        //registration3페이지로 이동하기 위한 인덴트 생성
        val nextStepIntent = Intent(this, Registration3::class.java)
        val nextButton: Button = findViewById(R.id.nextStep3)
        nextButton.setOnClickListener {
            startActivity(nextStepIntent)
        }
    }
}