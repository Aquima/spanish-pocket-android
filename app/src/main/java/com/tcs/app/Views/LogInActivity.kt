package com.tcs.app.Views

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.tcs.app.Models.WongUser
import com.tcs.app.R
import com.tcs.app.ViewModels.LogInViewModel
import com.tcs.app.ViewModels.SplashViewModel

class LogInActivity : AppCompatActivity() {
    lateinit var viewModel:LogInViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        supportActionBar?.hide()

        viewModel = ViewModelProviders.of(this).get(LogInViewModel::class.java)

    }
    fun tapToSignIn(view:View){
        val email = "jgomezvg@gmail.com"
        val password = "123456"
        viewModel.signIn(email,password,this).subscribe({user:WongUser ->


            Toast.makeText(this,user.email,Toast.LENGTH_LONG).show()
        } ,{error ->

            Toast.makeText(this,error.message,Toast.LENGTH_LONG).show()

        },{   Log.v("RxKotlin","Se Completo")},
            { Log.v("RxKotlin","is Susbcribed On")})
    }
}
