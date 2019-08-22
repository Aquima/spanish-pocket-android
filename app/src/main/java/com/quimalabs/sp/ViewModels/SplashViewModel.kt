package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import com.quimalabs.sp.Views.LogInActivity
import com.quimalabs.sp.Views.SplashActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashViewModel: ViewModel() {
    fun goToLogIn(context: Context,currentAct:SplashActivity){

        Timer().schedule(3000){
            val intent = Intent(context,LogInActivity::class.java)
            context.startActivity(intent)
            currentAct.finish()
        }
    }
}