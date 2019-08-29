package com.quimalabs.sp.Views

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.ImpPastViewModel
import kotlinx.android.synthetic.main.activity_imp_past.*

class ImpPastActivity : AppCompatActivity() {
    lateinit var viewModel: ImpPastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imp_past)

        this.btn_test_imp_past.setOnClickListener {

            btn_test_imp_past.animate().rotation(btn_test_imp_past.getRotation()-360).start()

            val intent = Intent(this, TestImpPastActivity::class.java)
            startActivity(intent)
        }
    }

    fun backScores(view: View) {
        this.onBackPressed()
    }

    fun pronounFirst(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstComplete.text = toBe[0]
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
