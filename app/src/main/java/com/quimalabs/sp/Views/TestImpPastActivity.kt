package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_test_imp_past.*

class TestImpPastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_imp_past)

    }

    fun impPastBack(view: View) {
        this.onBackPressed()
    }
    fun starAnimationImpPast(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()
    }
    fun keyboardImpPast(view: View){
        val currentText:String = this.txt_test_Imp_Past.text.toString()
        val btn:Button = view as Button
        this.txt_test_Imp_Past.text = currentText + btn.text.toString()
    }
    fun deleteImpPast(view: View){
        val txt:String = this.txt_test_Imp_Past.text.toString()
        if (!txt.isEmpty()){
            this.txt_test_Imp_Past.text = txt.substring(0,txt.length-1)
        }
    }
}
