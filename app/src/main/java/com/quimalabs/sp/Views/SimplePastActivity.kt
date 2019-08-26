package com.quimalabs.sp.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_simple_past.*

class SimplePastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_past)

        this.btn_test_simple_past.setOnClickListener {
            val intent = Intent(this, TestSimplePastActivity::class.java)
            startActivity(intent)
        }
    }
    fun backStores(view: View) {
        this.onBackPressed()
    }
}
