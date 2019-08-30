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

    fun pronounFirstImpPast(view: View){
        this.viewModel.retriveImpPast().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstImpPast.text = toBe[0]
            this.txtSecondImpPast.text = toBe[1]
            this.txtThirdImpPast.text = toBe[2]
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
    fun pronounSecondImpPast(view: View){
        this.viewModel.retriveImpPast().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstImpPast.text = toBe[3]
            this.txtSecondImpPast.text = toBe[4]
            this.txtThirdImpPast.text = toBe[5]
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
    fun pronounThirdImpPast(view: View){
        this.viewModel.retriveImpPast().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstImpPast.text = toBe[6]
            this.txtSecondImpPast.text = toBe[7]
            this.txtThirdImpPast.text = toBe[8]
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
    fun pronounQuarterImpPast(view: View){
        this.viewModel.retriveImpPast().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstImpPast.text = toBe[9]
            this.txtSecondImpPast.text = toBe[10]
            this.txtThirdImpPast.text = toBe[11]
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
    fun pronounFifthImpPast(view: View){
        this.viewModel.retriveImpPast().subscribe({toBe:List<String> ->

            //            if (this.btn_first.setOnTouchListener(true))
            this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
            this.txtFirstImpPast.text = toBe[12]
            this.txtSecondImpPast.text = toBe[13]
            this.txtThirdImpPast.text = toBe[14]
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
