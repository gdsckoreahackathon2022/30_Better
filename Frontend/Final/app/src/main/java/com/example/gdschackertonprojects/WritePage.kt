package com.example.gdschackertonprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * 메인페이지로 돌아가는 버튼
 * 오늘의 날짜
 * 식단
 * 체크리스트
 * 사진추가
 * 업로드하기버튼
 */
class WritePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_page)

        //main페이지로 이동하기 위한 인덴트 생성(취소하기)
        val mainIntent = Intent(this, MainPage::class.java)
        val cancelButton: Button = findViewById(R.id.cancel)
        cancelButton.setOnClickListener {
            startActivity(mainIntent)
        }

        //main페이지로 이동하기 위한 인덴트 생성(완료하기)
        //이 경우 서버와 연동 필요
        //val mainIntent = Intent(this, MainPage::class.java)
        val uploadButton: Button = findViewById(R.id.upload)
        uploadButton.setOnClickListener {
            startActivity(mainIntent)
        }
    }
}