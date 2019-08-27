package com.quimalabs.sp.Views

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.ScoreViewModel

class ScoreActivity : AppCompatActivity() {
    lateinit var viewModel:ScoreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        viewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
       // viewModel.getMyScore()
        print(viewModel.getMyScore())
    }
}
