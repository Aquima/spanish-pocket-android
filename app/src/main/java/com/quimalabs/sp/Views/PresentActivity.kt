package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import androidx.lifecycle.ViewModelProviders
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.DrawWord
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import com.quimalabs.sp.ViewModels.PresentViewModel
import kotlinx.android.synthetic.main.activity_present.*

class PresentActivity : AppCompatActivity() {
    lateinit var viewModel:PresentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)
        viewModel = ViewModelProviders.of(this).get(PresentViewModel::class.java)
        setComponentBasePresent(viewPresent)
        this.btn_go_test_present.setOnClickListener {
            val intent = Intent(this,TestPresentActivity::class.java)
            startActivity(intent)
        }
        if ( viewModel.isFirstime == false) {
            viewModel.isFirstime = true
            disableClickButtons(view)
            toolsTipsVisibility(viewPresent)
        }
    }

    fun herePresent(view: View){
        this.btnPresent.visibility = View.GONE
        this.btn_go_test_present.visibility = View.GONE
        this.viewToolsTipsPresent.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayout6.visibility = View.GONE
        clickButtons(view)
    }
    fun toolsTipsVisibility(view: View){
        this.btnPresent.visibility = View.VISIBLE
        this.btn_go_test_present.visibility = View.VISIBLE
        this.viewToolsTipsPresent.visibility = View.VISIBLE
        this.txt_1.visibility = View.VISIBLE
        this.txt_2.visibility = View.VISIBLE
        this.linearLayout6.visibility = View.VISIBLE
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
    fun setComponentBasePresent(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.Yo)
        this.txtFirstPronouns.text=toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text=toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text=toBe[2].base.toUpperCase()
    }
    fun selectPronouns(){
        var buttons = ArrayList<Button>()
//        private fun loopThrough(parent: ViewGroup) {
//            for (i in 0 until parent.childCount) {
//                val child = parent.getChildAt(i)
//                if (child is Button) buttons.add(child)
//                else if (child is ViewGroup) loopThrough(child)
//            }
//        }
    }

    fun pronounFirst(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.Yo)
        this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstComplete.text = toBe[0].variant.toUpperCase()
        this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondComplete.text = toBe[1].variant.toUpperCase()
        this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdComplete.text = toBe[2].variant.toUpperCase()
    }
    fun pronounSecond(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.Tu)
        this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstComplete.text = toBe[0].variant.toUpperCase()
        this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondComplete.text = toBe[1].variant.toUpperCase()
        this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdComplete.text = toBe[2].variant.toUpperCase()
    }
    fun pronounThird(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.El)
        this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstComplete.text = toBe[0].variant.toUpperCase()
        this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondComplete.text = toBe[1].variant.toUpperCase()
        this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdComplete.text = toBe[2].variant.toUpperCase()
    }
    fun pronounQuarter(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.Nosotros)
        this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstComplete.text = toBe[0].variant.toUpperCase()
        this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondComplete.text = toBe[1].variant.toUpperCase()
        this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdComplete.text = toBe[2].variant.toUpperCase()
    }
    fun pronounFifth(view: View){
        var toBe: List<DrawWord> = viewModel.getPronounsForPresent(EnumPronouns.Ellos)
        this.txtFirstComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstComplete.text = toBe[0].variant.toUpperCase()
        this.txtSecondComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondComplete.text = toBe[1].variant.toUpperCase()
        this.txtThirdComplete.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdComplete.text = toBe[2].variant.toUpperCase()
    }

    fun onStarAnimationPresent(view: View){
        val valueAnimator = ValueAnimator.ofFloat(0f, 360f)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_test_present.rotation = value
        }
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 600
        valueAnimator.start()
        val intent = Intent(this, TestPresentActivity::class.java)
        startActivity(intent)
    }
}
