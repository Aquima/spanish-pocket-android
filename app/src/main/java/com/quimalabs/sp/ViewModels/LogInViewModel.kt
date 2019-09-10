package com.quimalabs.sp.ViewModels

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.ApiClient
import com.quimalabs.sp.Models.LogInModel
import com.quimalabs.sp.Models.WongUser
import com.quimalabs.sp.Views.LogInActivity
import com.quimalabs.sp.Views.ScoreActivity
import io.reactivex.Observable

class LogInViewModel:ViewModel() {
    lateinit var apiClient:ApiClient
    var logInModel = LogInModel()
    fun signIn(email:String,password:String,activity:Activity):Observable<WongUser>{
        this.apiClient = ApiClient(activity)
        return apiClient.signIn(email,password)
    }

    fun goToHome(context: Context, currentAct: LogInActivity) {
        val intent = Intent(context,ScoreActivity::class.java)
        context.startActivity(intent)
       // currentAct.finish()
    }
}