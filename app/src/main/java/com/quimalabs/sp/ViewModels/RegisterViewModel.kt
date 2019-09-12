package com.quimalabs.sp.ViewModels

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.ApiClient
import com.quimalabs.sp.Models.SPUser
import io.reactivex.Observable

class RegisterViewModel: ViewModel() {
    lateinit var apiClient: ApiClient
    fun createAccount(email:String, password:String, activity: Activity): Observable<SPUser> {
        this.apiClient = ApiClient(activity)
        return apiClient.createAccount(email,password)
    }
}