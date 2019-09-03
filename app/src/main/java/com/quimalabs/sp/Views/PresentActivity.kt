package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.Enumerators.Pronouns
import com.quimalabs.sp.ViewModels.PresentViewModel
import kotlinx.android.synthetic.main.activity_present.*

class PresentActivity : AppCompatActivity() {
    lateinit var viewModel:PresentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(PresentViewModel::class.java)

        this.btn_go_test_present.setOnClickListener { val intent = Intent(this,TestPresentActivity::class.java)
            startActivity(intent)
        }
    }

    fun herePresent(view: View){
        this.btnPresent.visibility = View.GONE
        this.btn_go_test_present.visibility = View.GONE
        this.viewPresent.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayout6.visibility = View.GONE
        clickButtons(view)
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.btn_test_present.isClickable = false
        this.btn_first.isClickable = false
        this.btn_second.isClickable = false
        this.btn_third.isClickable = false
        this.btn_quarter.isClickable = false
        this.btn_fifth.isClickable = false
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.btn_test_present.isClickable = true
        this.btn_first.isClickable = true
        this.btn_second.isClickable = true
        this.btn_third.isClickable = true
        this.btn_quarter.isClickable = true
        this.btn_fifth.isClickable = true
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
