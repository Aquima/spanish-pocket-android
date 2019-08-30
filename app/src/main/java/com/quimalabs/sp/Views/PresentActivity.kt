package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.TextView
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.Enumerators.Pronouns
import com.quimalabs.sp.ViewModels.PresentViewModel
import kotlinx.android.synthetic.main.activity_present.*

class PresentActivity : AppCompatActivity() {
    lateinit var viewModel:PresentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)

        viewModel = ViewModelProviders.of(this).get(PresentViewModel::class.java)

//        this.btn_test_present.setOnClickListener {
//
////            btn_test_present.animate().rotation(btn_test_present.getRotation()-360).start()
//
//            val intent = Intent(this, TestPresentActivity::class.java)
//            startActivity(intent)
//        }
//        this.setupPronouns()
//        this.pronouns()
    }
    fun backScores(view : View){
        this.onBackPressed()
    }
    fun setupPronouns(){

        this.btn_first.tag = Pronouns.Yo
        this.btn_second.tag = Pronouns.Tu
        this.btn_third.tag = Pronouns.El
        this.btn_quarter.tag = Pronouns.Nosotros
        this.btn_fifth.tag = Pronouns.Ellos
//        this.btn_first.setOnClickListener(pronouns(btn))
    }

    fun pronounFirst(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

//            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[0]
            this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondComplete.text = toBe[1]
            this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdComplete.text = toBe[2]
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
    fun pronounSecond(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[3]
            this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondComplete.text = toBe[4]
            this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdComplete.text = toBe[5]
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
    fun pronounThird(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[6]
            this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondComplete.text = toBe[7]
            this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdComplete.text = toBe[8]
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
    fun pronounQuarter(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[9]
            this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondComplete.text = toBe[10]
            this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdComplete.text = toBe[11]
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
    fun pronounFifth(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[12]
            this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondComplete.text = toBe[13]
            this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdComplete.text = toBe[14]
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

    fun onStarAnimationPresent(view: View){
        val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            // 2
            this.btn_test_present.rotation = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 600
        valueAnimator.start()

        val intent = Intent(this, TestPresentActivity::class.java)
        startActivity(intent)
    }
}
