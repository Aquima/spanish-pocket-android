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
        viewModel = ViewModelProviders.of(this).get(FutureViewModel::class.java)

//        this.btn_test_future.setOnClickListener {
//
//            btn_test_future.animate().rotation(btn_test_future.getRotation()-360).start()
//
//            val intent = Intent(this, TestFutureActivity::class.java)
//            startActivity(intent)
//        }
    }
    fun backStores(view: View) {
        this.onBackPressed()
    }

//    fun futureComplete(view: View) {
//        this.txtFirstComplete.visibility
//    }

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
            //prueba
//            btn_first.setOnTouchListener(View.OnTouchListener() { v, event ->
//                if (event.action == MotionEvent.ACTION_UP) {
//                    this.txtFirstComplete.text = toBe[0]
//                    this.txtSecondComplete.text = toBe[1]
//                    this.txtThirdComplete.text = toBe[2]
//                    true
//                } else
//                    false
//            })

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
            //prueba
//            btn_second.setOnTouchListener(View.OnTouchListener() { v, event ->
//                if (event.action == MotionEvent.ACTION_UP) {
//                    this.txtFirstComplete.text = toBe[3]
//                    this.txtSecondComplete.text = toBe[4]
//                    this.txtThirdComplete.text = toBe[5]
//                    true
//                } else
//                    false
//            })

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
            //prueba
//            btn_third.setOnTouchListener(View.OnTouchListener() { v, event ->
//                if (event.action == MotionEvent.ACTION_UP) {
//                    this.txtFirstComplete.text = toBe[6]
//                    this.txtSecondComplete.text = toBe[7]
//                    this.txtThirdComplete.text = toBe[8]
//                    true
//                } else
//                    false
//            })

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
            //prueba
//            btn_quarter.setOnTouchListener(View.OnTouchListener() { v, event ->
//                if (event.action == MotionEvent.ACTION_UP) {
//                    this.txtFirstComplete.text = toBe[9]
//                    this.txtSecondComplete.text = toBe[10]
//                    this.txtThirdComplete.text = toBe[11]
//                    true
//                } else
//                    false
//            })

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
            //prueba
//            btn_fifth.setOnTouchListener(View.OnTouchListener() { v, event ->
//                if (event.action == MotionEvent.ACTION_UP) {
//                    this.txtFirstComplete.text = toBe[12]
//                    this.txtSecondComplete.text = toBe[13]
//                    this.txtThirdComplete.text = toBe[14]
//                    true
//                } else
//                    false
//            })

        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }

    fun onStarAnimation(view: View){
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
