package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.TestSimplePastViewModel
import kotlinx.android.synthetic.main.activity_test_simple_past.*

class TestSimplePastActivity : AppCompatActivity() {
    lateinit var viewModel:TestSimplePastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_simple_past)
    }

    fun backStores(view: View) {
        this.onBackPressed()
    }
    fun starAnimationSimplePast(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()

        this.txt_test_simple_past.text = ""
        refreshPresent()
    }
    //
    fun random(n: Int) = (Math.random() * n).toInt()
    fun refreshPresent(){
        viewModel = ViewModelProviders.of(this).get(TestSimplePastViewModel::class.java)
        if(switchSimplePast.isChecked){
        }else{
            this.viewModel.returnTestSimplePast().subscribe({test:List<String> ->
                val n = test.count()
                val r = random(n)
                this.lbl_test_simple_past.text = test[r]
                val mutableList = test.toMutableList().removeAt(r)
            },{error ->
                //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
            })
        }
        this.viewModel.returnPronounSimplePast().subscribe({pronouns:List<String> ->
            val p = pronouns.count()
            val r = random(p)
            this.txt_pronouns.text = pronouns[r]
        })
    }
    fun keyboardSimplePast(view: View){
        val currentText:String = this.txt_test_simple_past.text.toString()
        val btn:Button = view as Button
        this.txt_test_simple_past.text = currentText + btn.text.toString()
    }
    fun deleteKeyboardSimplePast(view: View){
        val textDelete:String = this.txt_test_simple_past.text.toString()
        if (!textDelete.isEmpty()){
            this.txt_test_simple_past.text = textDelete.substring(0,textDelete.length - 1)
        }
    }
}
