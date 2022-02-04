package com.example.macgongmon

//import com.google.gson.annotations.SerializedName

data class ResponseModel (
    val title: String = "",
    val content: String = "",
    val check1: Int = 0,
    val check2: Int = 0,
    val check3: Int = 0,
    val check4: Int = 0,
    val check5: Int = 0
)

data class ContentModel (
    val content: String = ""
)