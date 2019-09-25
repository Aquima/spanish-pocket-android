package com.quimalabs.sp.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R

class RecoverPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover_password)
    }
    fun backLogin(view: View){
        this.onBackPressed()
    }
}
