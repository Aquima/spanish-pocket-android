package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_test_simple_past.*

class TestSimplePastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_simple_past)
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }
    fun starAnimationSimplePast(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()
    }
}
