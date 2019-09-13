package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import androidx.lifecycle.ViewModelProvider
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.lifecycle.ViewModelProviders
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.DrawWord
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import com.quimalabs.sp.ViewModels.SimplePastViewModel
import kotlinx.android.synthetic.main.activity_simple_past.*

class SimplePastActivity : AppCompatActivity() {
    lateinit var viewModel:SimplePastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_past)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(SimplePastViewModel::class.java)
        setComponentBaseSimplePast(viewSimplePast)
        this.btn_go_test_simple_past.setOnClickListener {
            val intent = Intent(this, TestSimplePastActivity::class.java)
            this.startActivity(intent)
        }
        if (viewModel.isFirstime==false){
            viewModel.isFirstime=true
            toolsTipsVisibility(viewSimplePast)
        }
    }

    fun hereSimplePast(view: View) {
        this.btnSimplePast.visibility = View.GONE
        this.btn_go_test_simple_past.visibility = View.GONE
        this.viewToolsTipsSimplePast.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutSimplePast.visibility = View.GONE
        clickButtons(view)
    }
    fun toolsTipsVisibility(view: View){
        this.btnSimplePast.visibility = View.VISIBLE
        this.btn_go_test_simple_past.visibility = View.VISIBLE
        this.viewToolsTipsSimplePast.visibility = View.VISIBLE
        this.txt_1.visibility = View.VISIBLE
        this.txt_2.visibility = View.VISIBLE
        this.linearLayoutSimplePast.visibility = View.VISIBLE
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
    fun setComponentBaseSimplePast(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.Yo)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
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
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.Yo)
        this.txtFirstPastSimple.text = toBe[0].variant.toUpperCase()
        this.txtSecondPastSimple.text = toBe[1].variant.toUpperCase()
        this.txtThirdPastSimple.text = toBe[2].variant.toUpperCase()
        this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
    }
    fun pronounSecondPastSimple(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.Tu)
        this.txtFirstPastSimple.text = toBe[0].variant.toUpperCase()
        this.txtSecondPastSimple.text = toBe[1].variant.toUpperCase()
        this.txtThirdPastSimple.text = toBe[2].variant.toUpperCase()
        this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
    }
    fun pronounThirdPastSimple(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.El)
        this.txtFirstPastSimple.text = toBe[0].variant.toUpperCase()
        this.txtSecondPastSimple.text = toBe[1].variant.toUpperCase()
        this.txtThirdPastSimple.text = toBe[2].variant.toUpperCase()
        this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
    }
    fun pronounQuarterPastSimple(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.Nosotros)
        this.txtFirstPastSimple.text = toBe[0].variant.toUpperCase()
        this.txtSecondPastSimple.text = toBe[1].variant.toUpperCase()
        this.txtThirdPastSimple.text = toBe[2].variant.toUpperCase()
        this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
    }
    fun pronounFifthPastSimple(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForSimplePast(EnumPronouns.Ellos)
        this.txtFirstPastSimple.text = toBe[0].variant.toUpperCase()
        this.txtSecondPastSimple.text = toBe[1].variant.toUpperCase()
        this.txtThirdPastSimple.text = toBe[2].variant.toUpperCase()
        this.txtFirstPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdPastSimple.setTextColor(getResources().getColorStateList(R.color.colorGreen))
    }
}
