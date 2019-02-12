package com.tcs.app.ViewModels

import android.app.Activity
import android.arch.lifecycle.ViewModel
import com.tcs.app.Models.ApiClient
import com.tcs.app.Models.WongUser
import io.reactivex.Observable

class RegisterViewModel: ViewModel() {
    lateinit var apiClient: ApiClient
    fun createAccount(email:String, password:String, activity: Activity): Observable<WongUser> {
        this.apiClient = ApiClient(activity)
        return apiClient.createAccount(email,password)
    }
}