package com.quimalabs.sp.Views

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.FutureViewModel
import kotlinx.android.synthetic.main.activity_future.*

class FutureActivity : AppCompatActivity() {
    lateinit var viewModel:FutureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future)

        this.btn_test_future.setOnClickListener {

            btn_test_future.animate().rotation(btn_test_future.getRotation()-360).start()

            val intent = Intent(this, TestFutureActivity::class.java)
            startActivity(intent)
        }
    }
    fun backStores(view: View) {
        this.onBackPressed()
    }

    fun futureComplete(view: View) {
        this.txtFirstComplete.visibility
    }

    fun pronounFirst(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //  if (this.btn_first.setOnTouchListener(true))
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[0]
            this.txtFirstComplete.visibility
            this.txtSecondComplete.text = toBe[1]
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
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[3]
            this.txtSecondComplete.text = toBe[4]
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
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[6]
            this.txtSecondComplete.text = toBe[7]
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
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[9]
            this.txtSecondComplete.text = toBe[10]
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
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[12]
            this.txtSecondComplete.text = toBe[13]
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
}
