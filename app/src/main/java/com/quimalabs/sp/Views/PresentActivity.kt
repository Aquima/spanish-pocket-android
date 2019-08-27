package com.quimalabs.sp.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_present.*

class PresentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)
        this.btn_refresh.setOnClickListener {
            val intent = Intent(this, TestPresentActivity::class.java)
            startActivity(intent)
        }
    }
    fun backScores(view : View){
        this.onBackPressed()
    }
    fun firsthPronouns(view: View){
        val txtFirst:String
        val txtComplete = findViewById<TextView>(R.id.txtFirstComplete).apply { this  }
        val textView: TextView = findViewById(R.id.txtFirstComplete)
    }
}
