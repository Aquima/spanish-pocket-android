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
import com.quimalabs.sp.ViewModels.ImpPastViewModel
import kotlinx.android.synthetic.main.activity_imp_past.*

class ImpPastActivity : AppCompatActivity() {
    lateinit var viewModel: ImpPastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imp_past)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(ImpPastViewModel::class.java)
        if (viewModel.isFirstime==false){
            viewModel.isFirstime=true
            toolsTipsVisibility(viewImpPast)
        }
    }

    fun hereImpPast(view: View) {
        this.btnImpPast.visibility = View.GONE
        this.btn_go_test_Imp_Past.visibility = View.GONE
        this.viewToolsTipsImpPast.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutImpPast.visibility = View.GONE
        clickButtons(view)
    }
    fun toolsTipsVisibility(view: View){
        this.btnImpPast.visibility = View.VISIBLE
        this.btn_go_test_Imp_Past.visibility = View.VISIBLE
        this.viewToolsTipsImpPast.visibility = View.VISIBLE
        this.txt_1.visibility = View.VISIBLE
        this.txt_2.visibility = View.VISIBLE
        this.linearLayoutImpPast.visibility = View.VISIBLE
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
        var toBe:List<DrawWord> = viewModel.getPronounsForImpPast(EnumPronouns.Yo)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstImpPast.text = toBe[0].variant.toUpperCase()
        this.txtSecondImpPast.text = toBe[1].variant.toUpperCase()
        this.txtThirdImpPast.text = toBe[2].variant.toUpperCase()
    }
    fun pronounSecondImpPast(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForImpPast(EnumPronouns.Tu)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstImpPast.text = toBe[0].variant.toUpperCase()
        this.txtSecondImpPast.text = toBe[1].variant.toUpperCase()
        this.txtThirdImpPast.text = toBe[2].variant.toUpperCase()
    }
    fun pronounThirdImpPast(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForImpPast(EnumPronouns.El)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstImpPast.text = toBe[0].variant.toUpperCase()
        this.txtSecondImpPast.text = toBe[1].variant.toUpperCase()
        this.txtThirdImpPast.text = toBe[2].variant.toUpperCase()
    }
    fun pronounQuarterImpPast(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForImpPast(EnumPronouns.Nosotros)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstImpPast.text = toBe[0].variant.toUpperCase()
        this.txtSecondImpPast.text = toBe[1].variant.toUpperCase()
        this.txtThirdImpPast.text = toBe[2].variant.toUpperCase()
    }
    fun pronounFifthImpPast(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForImpPast(EnumPronouns.Ellos)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdImpPast.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstImpPast.text = toBe[0].variant.toUpperCase()
        this.txtSecondImpPast.text = toBe[1].variant.toUpperCase()
        this.txtThirdImpPast.text = toBe[2].variant.toUpperCase()
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
