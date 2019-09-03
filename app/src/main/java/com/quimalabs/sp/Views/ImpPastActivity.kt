package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.ImpPastViewModel
import kotlinx.android.synthetic.main.activity_imp_past.*

class ImpPastActivity : AppCompatActivity() {
    lateinit var viewModel: ImpPastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imp_past)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(ImpPastViewModel::class.java)

    }

    fun hereImpPast(view: View) {
        this.btnImpPast.visibility = View.GONE
        this.btn_go_test_Imp_Past.visibility = View.GONE
        this.viewImpPast.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutImpPast.visibility = View.GONE
        clickButtons(view)
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.btn_test_imp_past.isClickable = false
        this.btn_first_imp_past.isClickable = false
        this.btn_second_imp_past.isClickable = false
        this.btn_third_imp_past.isClickable = false
        this.btn_quarter_imp_past.isClickable = false
        this.btn_fifth_imp_past.isClickable = false
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.btn_test_imp_past.isClickable = true
        this.btn_first_imp_past.isClickable = true
        this.btn_second_imp_past.isClickable = true
        this.btn_third_imp_past.isClickable = true
        this.btn_quarter_imp_past.isClickable = true
        this.btn_fifth_imp_past.isClickable = true
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
        },{error ->
            //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })
    }
    fun onStarAnimationImpPast(view: View){
        val valueAnimator = ValueAnimator.ofFloat( 0f,360f)
        valueAnimator.addUpdateListener{
            val value=it.animatedValue as Float
            this.btn_test_imp_past.rotation = value
        }
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 600
        valueAnimator.start()

        val intent = Intent(this, TestImpPastActivity::class.java)
        startActivity(intent)
    }

}
