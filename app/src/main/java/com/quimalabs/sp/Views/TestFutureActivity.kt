package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.TestFutureViewModel
import kotlinx.android.synthetic.main.activity_future.*
import kotlinx.android.synthetic.main.activity_test_future.*
import kotlinx.android.synthetic.main.activity_test_future.txt_1
import kotlinx.android.synthetic.main.activity_test_future.txt_2

class TestFutureActivity : AppCompatActivity() {
    lateinit var viewModel:TestFutureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_future)

        loopThrough(findViewById<ViewGroup>(R.id.activityTestFuture))
        setClickButtonsTestSimplePast(false)
        this.btn_here_test_future.isClickable = true
    }

    fun hereTestFuture(view: View){
        this.btn_here_test_future.visibility = View.GONE
        this.viewTestFuture.visibility = View.GONE
        this.txt_1.visibility = View.GONE
        this.txt_2.visibility = View.GONE
        this.txt_scoreTest.visibility = View.GONE
        this.linearLayoutTestFuture.visibility = View.GONE
        endToolTipsTestSimplePast(view)
    }
    private val buttons = ArrayList<Button>() //this is a global variable
    private fun loopThrough(parent: ViewGroup) {
        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            if (child is Button) buttons.add(child)
            else if (child is ViewGroup) loopThrough(child)
        }
    }
    fun setClickButtonsTestSimplePast(value: Boolean){
        for(button in buttons){
            button.isClickable = value
        }
    }
    fun endToolTipsTestSimplePast(view: View){
        setClickButtonsTestSimplePast(true)
    }
    fun futureBack(view: View) {
        this.onBackPressed()
    }
    fun starAnimationFuture(view: View){
        val animation = ValueAnimator.ofFloat(0f,360f)
        animation.addUpdateListener {
            val value = it.animatedValue as Float
            this.btn_refresh.rotation = value
        }
        animation.interpolator = LinearInterpolator()
        animation.duration = 600
        animation.start()
        this.txt_test_Future.text = ""
        refreshFuture()
    }
    //
    fun random(n: Int) = (Math.random() * n).toInt()
    fun refreshFuture(){
        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(TestFutureViewModel::class.java)
        if(switchFuture.isChecked){
        }else{
            this.viewModel.returnTestFuture().subscribe({test:List<String> ->
                val n = test.count()
                val r = random(n)
                this.lbl_test_future.text = test[r]
                val mutableList = test.toMutableList().removeAt(r)
            },{error ->
                //            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
            })
        }
        this.viewModel.returnPronounFuture().subscribe({pronouns:List<String> ->
            val p = pronouns.count()
            val r = random(p)
            this.txt_pronouns.text = pronouns[r]
        })
    }

    fun keyboardFuture(view: View){
        val currentText:String = this.txt_test_Future.text.toString()
        val btn:Button = view as Button
        this.txt_test_Future.text = currentText + btn.text.toString()
    }
    fun deleteCharacterFuture(view: View){
        val deleteText:String = this.txt_test_Future.text.toString()
        if (!deleteText.isEmpty()){
            this.txt_test_Future.text = deleteText.substring(0,deleteText.length-1)
        }
    }
}
