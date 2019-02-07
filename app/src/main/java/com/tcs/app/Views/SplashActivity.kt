package com.tcs.app.Views

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tcs.app.R
import com.tcs.app.ViewModels.SplashViewModel

class SplashActivity : AppCompatActivity() {
    lateinit var viewModel:SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        viewModel.goToHome(this)
    }

}
