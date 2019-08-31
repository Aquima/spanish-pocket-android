package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_test_future.*

class TestFutureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_future)
    }

    fun futureBack(view: View) {
        this.onBackPressed()
    }
    fun starAnimationFuture(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()
    }
    fun keyboardFuture(view: View){
        val currentText:String = this.txt_test_Future.text.toString()
        val btn:Button = view as Button
        this.txt_test_Future.text = currentText + btn.text.toString()
    }
    fun deleteFuture(view: View){
        val deleteText:String = this.txt_test_Future.text.toString()
        if (!deleteText.isEmpty()){
            this.txt_test_Future.text = deleteText.substring(0,deleteText.length-1)
        }
    }
}
