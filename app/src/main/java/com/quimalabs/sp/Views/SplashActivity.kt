package com.quimalabs.sp.Views

import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.SplashViewModel

class SplashActivity : AppCompatActivity() {
    lateinit var viewModel:SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(SplashViewModel::class.java)
        //hay que mejorar
        viewModel.goToLogIn(this,this)

    }

}
