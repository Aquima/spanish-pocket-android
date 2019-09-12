package com.quimalabs.sp.Views

import androidx.lifecycle.ViewModelProvider
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.jakewharton.rxbinding3.view.clicks
import com.jakewharton.rxbinding3.widget.textChanges
import com.quimalabs.sp.Models.SPUser
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.LogInViewModel
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import kotlinx.android.synthetic.main.activity_log_in.*



class LogInActivity : AppCompatActivity() {
    lateinit var viewModel:LogInViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        supportActionBar?.hide()

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(LogInViewModel::class.java)
        this.btn_newaccount.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        var validateEmail:Observable<Boolean> = this.txt_email
            .textChanges().map { it -> Boolean
                viewModel.logInModel.validateMail(it.toString())
            }.share()

        var validatePassword:Observable<Boolean> =
        this.txt_password
            .textChanges().map { it -> Boolean
                viewModel.logInModel.validatePassword(it.toString())
            }.share()

        //Combinar observables

        var isSignInEnabled: Observable<Boolean> = Observable.combineLatest(validateEmail,
            validatePassword,BiFunction() { u:Boolean, p:Boolean -> u && p})


        val observer = isSignInEnabled.subscribe {
            if (it == true) {
                btn_login.visibility = View.VISIBLE
            }else{
                btn_login.visibility = View.GONE
            }
        }
        
        this.btn_login.clicks().subscribe{

            val email = txt_email.text.toString()
            val password = txt_password.text.toString()
            viewModel.signIn(email,password,this).subscribe({user:SPUser ->
               // Toast.makeText(this, "Hola ${user.email}, has iniciado Sesión" , Toast.LENGTH_LONG).show()

                Handler(Looper.getMainLooper()).post {
                    // your codes here run on main Thread
                    goToHome()
                }

            },{error ->
                Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
            })
          //  Toast.makeText(this,"Click", Toast.LENGTH_LONG).show()
        }
    }


    fun tapToSignIn(view:View){
        val email = txt_email.text.toString()
        val password = txt_password.text.toString()

        viewModel.signIn(email,password,this).subscribe({user:SPUser ->
            Toast.makeText(this, "Hola ${user.email}, has iniciado Sesión" , Toast.LENGTH_LONG).show()
        },{error ->
            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun goToHome(){

            viewModel.goToHome(this,this)

    }
}
