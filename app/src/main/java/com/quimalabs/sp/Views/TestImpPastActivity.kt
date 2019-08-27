package com.quimalabs.sp.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R

class TestImpPastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_imp_past)

    }

    fun impPastBack(view: View) {
        this.onBackPressed()
    }
}
