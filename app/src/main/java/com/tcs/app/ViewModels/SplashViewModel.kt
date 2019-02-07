package com.tcs.app.ViewModels

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import android.util.Log
import com.google.firebase.FirebaseApp
import com.tcs.app.Views.HomeActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashViewModel: ViewModel() {
    fun goToHome(context: Context){

        //toda la logica para ir al home validacion traer configuraciuon etc etc
        Timer().schedule(3000){
            val intent = Intent(context,HomeActivity::class.java)
            context.startActivity(intent)
        }
    }
}