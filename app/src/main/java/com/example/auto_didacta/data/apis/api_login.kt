package com.example.auto_didacta.data.apis

// Request for POST /api/login
data class LoginRequest(
    val email: String,
    val password: String
)

// User info returned on login
data class LoginUser(
    val id: Int,
    val email: String
)

// Body containing token and user
data class LoginBody(
    val token: String,
    val user: LoginUser
)

// Standard response envelope
data class StandardResponse(
    val httpCode: Int,
    val message: String
)

// Full login response (envelope + body)
data class LoginResponse(
    val standardResponse: StandardResponse,
    val body: LoginBody
)