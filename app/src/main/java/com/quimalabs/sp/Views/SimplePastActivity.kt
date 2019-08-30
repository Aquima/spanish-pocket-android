package com.quimalabs.sp.Views

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.SimplePastViewModel
import kotlinx.android.synthetic.main.activity_simple_past.*

class SimplePastActivity : AppCompatActivity() {
    lateinit var viewModel:SimplePastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_past)

        this.btn_test_simple_past.setOnClickListener {

            btn_test_simple_past.animate().rotation(btn_test_simple_past.getRotation()-360).start()

            val intent = Intent(this, TestSimplePastActivity::class.java)
            startActivity(intent)
        }
    }
    fun backStores(view: View) {
        this.onBackPressed()
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
    fun pronounSecondPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[3]
            this.txtSecondPastSimple.text = toBe[4]
            this.txtThirdPastSimple.text = toBe[5]
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
    fun pronounThirdPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[6]
            this.txtSecondPastSimple.text = toBe[7]
            this.txtThirdPastSimple.text = toBe[8]
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
    fun pronounQuarterPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[9]
            this.txtSecondPastSimple.text = toBe[10]
            this.txtThirdPastSimple.text = toBe[11]
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
    fun pronounFifthPastSimple(view: View){
        this.viewModel.retrivePastSimple().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstPastSimple.text = toBe[12]
            this.txtSecondPastSimple.text = toBe[13]
            this.txtThirdPastSimple.text = toBe[14]
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

}
