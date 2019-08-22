package com.quimalabs.sp.ViewModels

import android.app.Activity
import android.arch.lifecycle.ViewModel
import com.quimalabs.sp.Models.ApiClient
import com.quimalabs.sp.Models.WongUser
import io.reactivex.Observable

class RegisterViewModel: ViewModel() {
    lateinit var apiClient: ApiClient
    fun createAccount(email:String, password:String, activity: Activity): Observable<WongUser> {
        this.apiClient = ApiClient(activity)
        return apiClient.createAccount(email,password)
    }
}