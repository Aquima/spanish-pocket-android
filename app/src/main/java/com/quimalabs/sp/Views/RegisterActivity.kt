package com.quimalabs.sp.Views

import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.quimalabs.sp.Models.SPUser
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.RegisterViewModel
import kotlinx.android.synthetic.main.activity_log_in.*

class RegisterActivity : AppCompatActivity() {
    lateinit var viewModel:RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(RegisterViewModel::class.java)
    }

    fun tapToCreateAccount(view: View){
        val email = txt_email.text.toString()
        val password = txt_password.text.toString()
        viewModel.createAccount(email,password,this).subscribe({user: SPUser ->
            Toast.makeText(this, "Felicitaciones ${user.email}, ya te encuentras registrado", Toast.LENGTH_LONG).show()
        },{error ->
            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })

    }

    fun backLogin(view: View){
        this.onBackPressed()
    }
}
