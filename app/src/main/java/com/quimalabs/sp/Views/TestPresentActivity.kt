package com.quimalabs.sp.Views

import android.animation.ValueAnimator
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_test_present.*
import kotlinx.android.synthetic.main.activity_test_present.view.*

class TestPresentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_present)

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
    }

    fun keyboard(view: View){
        val currentText:String =  this.txt_test_present.text.toString()
        val btn:Button = view as Button
        this.txt_test_present.text = currentText + btn.text.toString()

//        var btn_q = findViewById(R.id.btn_q) as Button
//        btn_q.setOnClickListener { this }
//        var btn_w = findViewById(R.id.btn_w) as Button
//        btn_w.setOnClickListener { this }
//        var btn_e = findViewById(R.id.btn_e) as Button
//        btn_e.setOnClickListener { this }
//        var btn_r = findViewById(R.id.btn_r) as Button
//        btn_r.setOnClickListener { this }
//        var btn_t = findViewById(R.id.btn_t) as Button
//        btn_t.setOnClickListener { this }
//        var btn_y = findViewById(R.id.btn_y) as Button
//        btn_y.setOnClickListener { this }
//        var btn_u = findViewById(R.id.btn_u) as Button
//        btn_u.setOnClickListener { this }
//        var btn_i = findViewById(R.id.btn_i) as Button
//        btn_i.setOnClickListener { this }
//        var btn_o = findViewById(R.id.btn_o) as Button
//        btn_o.setOnClickListener { this }
//        var btn_p = findViewById(R.id.btn_p) as Button
//        btn_p.setOnClickListener { this }
//
//        var btn_a = findViewById(R.id.btn_a) as Button
//        btn_a.setOnClickListener { this }
//        var btn_s = findViewById(R.id.btn_s) as Button
//        btn_s.setOnClickListener { this }
//        var btn_d = findViewById(R.id.btn_d) as Button
//        btn_d.setOnClickListener { this }
//        var btn_f = findViewById(R.id.btn_f) as Button
//        btn_f.setOnClickListener { this }
//        var btn_g = findViewById(R.id.btn_g) as Button
//        btn_g.setOnClickListener { this }
//        var btn_h = findViewById(R.id.btn_h) as Button
//        btn_h.setOnClickListener { this }
//        var btn_j = findViewById(R.id.btn_j) as Button
//        btn_j.setOnClickListener { this }
//        var btn_k = findViewById(R.id.btn_k) as Button
//        btn_k.setOnClickListener { this }
//        var btn_l = findViewById(R.id.btn_l) as Button
//        btn_l.setOnClickListener { this }
//        var btn_ñ = findViewById(R.id.btn_ñ) as Button
//        btn_ñ.setOnClickListener { this }
//
//        var btn_z = findViewById(R.id.btn_z) as Button
//        btn_z.setOnClickListener { this }
//        var btn_x = findViewById(R.id.btn_x) as Button
//        btn_x.setOnClickListener { this }
//        var btn_c = findViewById(R.id.btn_c) as Button
//        btn_c.setOnClickListener { this }
//        var btn_v = findViewById(R.id.btn_v) as Button
//        btn_v.setOnClickListener { this }
//        var btn_b = findViewById(R.id.btn_b) as Button
//        btn_b.setOnClickListener { this }
//        var btn_n = findViewById(R.id.btn_n) as Button
//        btn_n.setOnClickListener { this }
//        var btn_m = findViewById(R.id.btn_m) as Button
//        btn_m.setOnClickListener { this }
//
//        var btn_A = findViewById(R.id.btn_A) as Button
//        btn_A.setOnClickListener { this }
//        var btn_E = findViewById(R.id.btn_E) as Button
//        btn_E.setOnClickListener { this }
//        var btn_I = findViewById(R.id.btn_I) as Button
//        btn_I.setOnClickListener { this }
//        var btn_O = findViewById(R.id.btn_O) as Button
//        btn_O.setOnClickListener { this }
//        var btn_U = findViewById(R.id.btn_U) as Button
//        btn_U.setOnClickListener { this }
//
//        var btn_random = findViewById(R.id.btn_refresh) as Button
//        btn_random.setOnClickListener { this }
//        var btn_delete = findViewById(R.id.btn_bakSpace) as Button
//        btn_delete.setOnClickListener { this }
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
