package com.example.auto_didacta.data

//Quemado pero aca ira api para aws
class UserRepository {
    private val validEmail = "admin@email.com"
    private val validPassword = "1234"

    fun authenticate(email: String, pass: String): Boolean {
        return email == validEmail && pass == validPassword
    }
}