package com.example.auto_didacta.ui.navigation

import android.content.Context
import android.content.Intent
import com.example.auto_didacta.ui.main.MainActivity
import com.example.auto_didacta.ui.profile.profile
import com.example.auto_didacta.ui.register.register

object appNavigation {
    fun goToRegister(context: Context) {
        context.startActivity(Intent(context, register::class.java))
    }

    fun goToProfile(context: Context) {
        context.startActivity(Intent(context, profile::class.java))
    }

    fun goToMain(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}