package com.quimalabs.sp.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_future.*

class FutureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future)

        this.btn_test_future.setOnClickListener {
            val intent = Intent(this, TestFutureActivity::class.java)
            startActivity(intent)
        }
    }
    fun backStores(view: View) {
        this.onBackPressed()
    }

    fun futureComplete(view: View) {
        this.txtFirstComplete.visibility
    }
}
