package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.FutureViewModel
import kotlinx.android.synthetic.main.activity_future.*

class FutureActivity : AppCompatActivity() {
    lateinit var viewModel:FutureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(FutureViewModel::class.java)

    }
    fun hereFuture(view: View) {
        this.btnFuture.visibility = View.GONE
        this.btn_go_test_Future.visibility = View.GONE
        this.viewFuture.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutFuture.visibility = View.GONE
        clickButtons(view)
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.btn_test_future.isClickable = false
        this.btn_first_future.isClickable = false
        this.btn_second_future.isClickable = false
        this.btn_third_future.isClickable = false
        this.btn_quarter_future.isClickable = false
        this.btn_fifth_future.isClickable = false
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.btn_test_future.isClickable = true
        this.btn_first_future.isClickable = true
        this.btn_second_future.isClickable = true
        this.btn_third_future.isClickable = true
        this.btn_quarter_future.isClickable = true
        this.btn_fifth_future.isClickable = true
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }

    fun pronounFirstFuture(view: View){
        this.viewModel.retriveFuture().subscribe({toBe:List<String> ->

            //  if (this.btn_first.setOnTouchListener(true))
            this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstFuture.text = toBe[0]
            this.txtSecondFuture.text = toBe[1]
            this.txtThirdFuture.text = toBe[2]

            this.txtFirstFuture.visibility = View.VISIBLE
            this.txtSecondFuture.visibility = View.VISIBLE
            this.txtThirdFuture.visibility = View.VISIBLE
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounSecondFuture(view: View){
        this.viewModel.retriveFuture().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstFuture.text = toBe[3]
            this.txtSecondFuture.text = toBe[4]
            this.txtThirdFuture.text = toBe[5]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounThirdFuture(view: View){
        this.viewModel.retriveFuture().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstFuture.text = toBe[6]
            this.txtSecondFuture.text = toBe[7]
            this.txtThirdFuture.text = toBe[8]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounQuarterFuture(view: View){
        this.viewModel.retriveFuture().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstFuture.text = toBe[9]
            this.txtSecondFuture.text = toBe[10]
            this.txtThirdFuture.text = toBe[11]

        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun pronounFifthFuture(view: View){
        this.viewModel.retriveFuture().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstFuture.text = toBe[12]
            this.txtSecondFuture.text = toBe[13]
            this.txtThirdFuture.text = toBe[14]
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }

    fun onStarAnimationFuture(view: View){
        val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            // 2
            this.btn_test_future.rotation = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 600
        valueAnimator.start()

        val intent = Intent(this, TestFutureActivity::class.java)
        startActivity(intent)
    }

}
