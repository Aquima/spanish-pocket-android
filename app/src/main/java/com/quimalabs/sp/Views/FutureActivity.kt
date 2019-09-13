package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.lifecycle.ViewModelProviders

import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.DrawWord
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import com.quimalabs.sp.ViewModels.FutureViewModel
import kotlinx.android.synthetic.main.activity_future.*

class FutureActivity : AppCompatActivity() {
    lateinit var viewModel:FutureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future)
        disableClickButtons(view)
        viewModel = ViewModelProviders.of(this).get(FutureViewModel::class.java)
        setComponentBaseFuture(viewFuture)
        if (viewModel.isFirstime==false){
            viewModel.isFirstime=true
            toolsTipsVisibility(viewFuture)
        }
    }
    fun hereFuture(view: View) {
        this.btnFuture.visibility = View.GONE
        this.btn_go_test_Future.visibility = View.GONE
        this.viewToolsTipsFuture.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.linearLayoutFuture.visibility = View.GONE
        clickButtons(view)
    }
    fun toolsTipsVisibility(view: View){
        this.btnFuture.visibility = View.VISIBLE
        this.btn_go_test_Future.visibility = View.VISIBLE
        this.viewToolsTipsFuture.visibility = View.VISIBLE
        this.txt_1.visibility = View.VISIBLE
        this.txt_2.visibility = View.VISIBLE
        this.linearLayoutFuture.visibility = View.VISIBLE
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.btn_test_future.isClickable = false
        this.btn_first_future.isClickable = false
        this.btn_second_future.isClickable = false
        this.btn_third_future.isClickable = false
        this.btn_quarter_future.isClickable = false
        this.btn_fifth_future.isClickable = false
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.btn_test_future.isClickable = true
        this.btn_first_future.isClickable = true
        this.btn_second_future.isClickable = true
        this.btn_third_future.isClickable = true
        this.btn_quarter_future.isClickable = true
        this.btn_fifth_future.isClickable = true
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }
    fun setComponentBaseFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.Yo)
        this.txtFirstPronouns.text = toBe[0].base.toUpperCase()
        this.txtSecondPronouns.text = toBe[1].base.toUpperCase()
        this.txtThirdPronouns.text = toBe[2].base.toUpperCase()
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()
        this.txtFirstFuture.visibility = View.VISIBLE
        this.txtSecondFuture.visibility = View.VISIBLE
        this.txtThirdFuture.visibility = View.VISIBLE
    }

    fun pronounFirstFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.Yo)
        this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()

        this.txtFirstFuture.visibility = View.VISIBLE
        this.txtSecondFuture.visibility = View.VISIBLE
        this.txtThirdFuture.visibility = View.VISIBLE
    }
    fun pronounSecondFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.Tu)
        this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()
    }
    fun pronounThirdFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.El)
        this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()
    }
    fun pronounQuarterFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.Nosotros)
        this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()
    }
    fun pronounFifthFuture(view: View){
        var toBe:List<DrawWord> = viewModel.getPronounsForFuture(EnumPronouns.Ellos)
        this.txtFirstFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtSecondFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtThirdFuture.setTextColor(getResources().getColorStateList(R.color.colorGreen))
        this.txtFirstFuture.text = toBe[0].variant.toUpperCase()
        this.txtSecondFuture.text = toBe[1].variant.toUpperCase()
        this.txtThirdFuture.text = toBe[2].variant.toUpperCase()
    }

    fun onStarAnimationFuture(view: View){
        val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            // 2
            this.btn_test_future.rotation = value
        }

        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = 600
        valueAnimator.start()

        val intent = Intent(this, TestFutureActivity::class.java)
        startActivity(intent)
    }

}
