package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Registration3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration3)

        //registration1페이지로 이동하기 위한 인덴트 생성
        val previousStepIntent = Intent(this, Registration2::class.java)
        val previousButton: Button = findViewById(R.id.previousStep3)
        previousButton.setOnClickListener {
            startActivity(previousStepIntent)
        }
        //registration3페이지로 이동하기 위한 인덴트 생성
        val mainPageIntent = Intent(this, MainPage::class.java)
        val nextButton: Button = findViewById(R.id.nextStep3)
        nextButton.setOnClickListener {
            val toast = Toast.makeText(this, "수고하셨습니다!", Toast.LENGTH_SHORT)
            toast.show()
            startActivity(mainPageIntent)
        }
    }

}