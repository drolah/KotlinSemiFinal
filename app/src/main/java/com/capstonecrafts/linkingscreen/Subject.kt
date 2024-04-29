package com.capstonecrafts.linkingscreen

import java.io.Serializable

data class Subject(
    val EdpCode: Int,
    val CourseName: String,
    val Grade: Double
) : Serializable
