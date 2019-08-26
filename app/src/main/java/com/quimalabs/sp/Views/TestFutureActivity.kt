package com.quimalabs.sp.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R

class TestFutureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_future)
    }

    fun futureBack(view: View) {
        this.onBackPressed()
    }
}
