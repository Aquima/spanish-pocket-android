package com.quimalabs.sp.Views

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.SplashViewModel

class SplashActivity : AppCompatActivity() {
    lateinit var viewModel:SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        //hay que mejorar
        viewModel.goToLogIn(this,this)

    }

}
