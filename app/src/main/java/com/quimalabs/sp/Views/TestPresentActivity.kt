package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.TestPresentViewModel
import kotlinx.android.synthetic.main.activity_test_present.*
import android.view.ViewGroup







class TestPresentActivity : AppCompatActivity() {
    lateinit var viewModel:TestPresentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_present)
    }
    fun hereTestPresent(view: View){
        this.btn_here_test_present.visibility = View.GONE
        this.viewTestPresent.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.txt_scoreTest.visibility = View.GONE
        this.linearLayoutTestPresent.visibility = View.GONE
        clickButtons(view)
    }
    fun disableClickButtons(view: View){
        this.btn_back.isClickable = false
        this.switchPresent.isClickable = false
        this.btn_refresh.isClickable = false
        this.btn_bakSpace.isClickable = false

        val viewgroup = view as ViewGroup
        for (i in 0 until viewgroup.childCount) {
            val v1 = viewgroup.getChildAt(i)
            //if (v1 is ViewGroup) show_children(v1)
            v1.isClickable = false
        }
    }
    fun clickButtons(view: View){
        this.btn_back.isClickable = true
        this.switchPresent.isClickable = true
        this.btn_refresh.isClickable = true
        this.btn_bakSpace.isClickable = true

        val viewgroup = view as ViewGroup
        for (i in 0 until viewgroup.childCount) {
            val v1 = viewgroup.getChildAt(i)
            //if (v1 is ViewGroup) show_children(v1)
            v1.isClickable = true
        }
    }

    fun backPresent(view: View) {
        this.onBackPressed()
    }
    fun starAnimationPresent(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()

        //insert

        this.txt_test_present.text = ""
        refreshPresent()
    }
    //
    fun random(n: Int) = (Math.random() * n).toInt()
    fun refreshPresent(){
        viewModel = ViewModelProviders.of(this).get(TestPresentViewModel::class.java)
        if(switchPresent.isChecked){
        }else{
           this.viewModel.returnTestPresent().subscribe({test:List<String> ->
               val n = test.count()
               val r = random(n)
               this.lbl_test_present.text = test[r]
               val mutableList = test.toMutableList().removeAt(r)
           },{error ->
                    //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
            })
        }
        this.viewModel.returnPronounPresent().subscribe({pronouns:List<String> ->
            val p = pronouns.count()
            val r = random(p)
            this.txt_pronouns.text = pronouns[r]
        })
    }
    fun keyboard(view: View){
        val currentText:String =  this.txt_test_present.text.toString()
        val btn:Button = view as Button
        this.txt_test_present.text = currentText + btn.text.toString()
    }

    fun deleteLetter(view: View){
        val deleteText:String =  this.txt_test_present.text.toString()
        if(!deleteText.isEmpty()){
            this.txt_test_present.text = deleteText.substring(0,deleteText.length-1)
        }

    }
    fun refresh(view: View){
        this.txt_test_present.clearFocus()
    }

}
