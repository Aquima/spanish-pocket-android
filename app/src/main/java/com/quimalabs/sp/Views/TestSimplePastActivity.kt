package com.quimalabs.sp.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R

class TestSimplePastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_simple_past)
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }
}
