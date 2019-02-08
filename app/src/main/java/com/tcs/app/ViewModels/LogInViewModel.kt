package com.tcs.app.ViewModels

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.google.firebase.auth.FirebaseUser
import com.tcs.app.Models.ApiClient
import com.tcs.app.Models.WongUser
import io.reactivex.Observable
import java.util.*
import kotlin.concurrent.schedule

class LogInViewModel:ViewModel() {
    lateinit var apiClient:ApiClient
    fun signIn(email:String,password:String,activity:Activity):Observable<WongUser>{
        this.apiClient = ApiClient(activity)
        return apiClient.signIn(email,password)
    }
}