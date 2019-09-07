package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.SimplePastViewModel
import kotlinx.android.synthetic.main.activity_simple_past.*

class SimplePastActivity : AppCompatActivity() {
    lateinit var viewModel:SimplePastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_past)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(SimplePastViewModel::class.java)
        this.btn_go_test_simple_past.setOnClickListener {
            val intent = Intent(this, TestSimplePastActivity::class.java)
            this.startActivity(intent)
        }
    }

    fun hereSimplePast(view: View) {
        this.btnSimplePast.visibility = View.GONE
        this.btn_go_test_simple_past.visibility = View.GONE
        this.viewSimplePast.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutSimplePast.visibility = View.GONE
        clickButtons(view)
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.btn_test_simple_past.isClickable = false
        this.btn_first_past_simple.isClickable = false
        this.btn_second_past_simple.isClickable = false
        this.btn_third_past_simple.isClickable = false
        this.btn_quarter_past_simple.isClickable = false
        this.btn_fifth_past_simple.isClickable = false
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.btn_test_simple_past.isClickable = true
        this.btn_first_past_simple.isClickable = true
        this.btn_second_past_simple.isClickable = true
        this.btn_third_past_simple.isClickable = true
        this.btn_quarter_past_simple.isClickable = true
        this.btn_fifth_past_simple.isClickable = true
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }
    fun onStarAnimationTestSimplePast(view: View){
        val valueAnimatorSimplePast: ValueAnimator =ValueAnimator.ofFloat(0f,360f)
        valueAnimatorSimplePast.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_test_simple_past.rotation = value
        }
        valueAnimatorSimplePast.interpolator = LinearInterpolator()
        valueAnimatorSimplePast.duration = 600
        valueAnimatorSimplePast.start()
        val intentSimplePast = Intent(this, TestSimplePastActivity::class.java)
        startActivity(intentSimplePast)
    }
    fun pronounFirstPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.text = toBe[0]
            this.txtSecondPastSimple.text = toBe[1]
            this.txtThirdPastSimple.text = toBe[2]
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))

        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounSecondPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[3]
            this.txtSecondPastSimple.text = toBe[4]
            this.txtThirdPastSimple.text = toBe[5]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounThirdPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[6]
            this.txtSecondPastSimple.text = toBe[7]
            this.txtThirdPastSimple.text = toBe[8]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounQuarterPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[9]
            this.txtSecondPastSimple.text = toBe[10]
            this.txtThirdPastSimple.text = toBe[11]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounFifthPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[12]
            this.txtSecondPastSimple.text = toBe[13]
            this.txtThirdPastSimple.text = toBe[14]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
}
