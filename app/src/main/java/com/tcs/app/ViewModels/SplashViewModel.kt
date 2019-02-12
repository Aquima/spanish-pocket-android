package com.tcs.app.ViewModels

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import com.tcs.app.Views.LogInActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashViewModel: ViewModel() {
    fun goToHome(context: Context){
        Timer().schedule(3000){
            val intent = Intent(context,LogInActivity::class.java)
            context.startActivity(intent)
        }
    }
}