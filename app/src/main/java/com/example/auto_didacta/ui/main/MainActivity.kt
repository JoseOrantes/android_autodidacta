package com.example.auto_didacta.ui.main

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.auto_didacta.R
import com.example.auto_didacta.data.loginRepository
import com.example.auto_didacta.ui.navigation.appNavigation
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var textView1: TextView
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button

    private val viewModel: MainViewModel by viewModels()

    //Inicia aplicacion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        textView1 = findViewById(R.id.txtresultado)
        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)

        etEmail.setOnClickListener { etEmail.requestFocus() }
        etPassword.setOnClickListener { etPassword.requestFocus() }

        btnLogin.setOnClickListener {
            val mail = etEmail.text.toString()
            val pass = etPassword.text.toString()
            viewModel.performLogin(mail, pass)
        }

        btnRegister.setOnClickListener {
            appNavigation.goToRegister(this)
        }

        viewModel.loginResult.observe(this) { resultMessage ->
            textView1.text = resultMessage
            if (resultMessage == "Credenciales Correctas") {
                appNavigation.goToProfile(this)
            }
        }
    }

    //Ciclo de vida de la aplicacion
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}