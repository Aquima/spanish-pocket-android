package com.tcs.app.Views

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.tcs.app.Models.WongUser
import com.tcs.app.R
import com.tcs.app.ViewModels.LogInViewModel
import com.tcs.app.ViewModels.SplashViewModel
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {
    lateinit var viewModel:LogInViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        supportActionBar?.hide()

        viewModel = ViewModelProviders.of(this).get(LogInViewModel::class.java)
        this.btn_newaccount.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    fun tapToSignIn(view:View){
        val email = txt_email.text.toString()
        val password = txt_password.text.toString()
        viewModel.signIn(email,password,this).subscribe({user:WongUser ->
            Toast.makeText(this, "Hola ${user.email}, has iniciado Sesión" , Toast.LENGTH_LONG).show()
        },{error ->
            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
}
