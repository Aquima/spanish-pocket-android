package com.quimalabs.sp.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_imp_past.*

class ImpPastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imp_past)

        this.btn_test_imp_past.setOnClickListener {
            val intent = Intent(this, ImpPastActivity::class.java)
            startActivity(intent)
        }
    }

    fun backScores(view: View) {
        this.onBackPressed()
    }
}
