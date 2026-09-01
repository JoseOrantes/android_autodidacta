package com.example.auto_didacta.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.auto_didacta.data.loginRepository

// ViewModel for MainActivity; repository default initialized
class MainViewModel(private val repository: loginRepository = loginRepository()) : ViewModel() {

    private val _loginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = _loginResult

    // Maneja la respuesta del backend quemada por ahora
    fun performLogin(email: String, pass: String) {
        val isSuccess = repository.authenticate(email, pass)
        if (isSuccess) {
            _loginResult.value = "Credenciales Correctas"
        } else {
            _loginResult.value = "Wrong Credentials"
        }
    }
}