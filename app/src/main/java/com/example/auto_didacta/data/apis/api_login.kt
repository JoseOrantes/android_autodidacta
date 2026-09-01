package com.example.auto_didacta.data.apis

data class UserResponse(
    val id: Int,
    val email: String,
    val password: String? = null
)