package com.quimalabs.sp.Views

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.Enumerators.Pronouns
import com.quimalabs.sp.ViewModels.PresentViewModel
import kotlinx.android.synthetic.main.activity_present.*

class PresentActivity : AppCompatActivity() {

    lateinit var viewModel:PresentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)

        viewModel = ViewModelProviders.of(this).get(PresentViewModel::class.java)

        this.btn_test_present.setOnClickListener {

            btn_test_present.animate().rotation(btn_test_present.getRotation()-360).start()

            val intent = Intent(this, TestPresentActivity::class.java)
            startActivity(intent)
        }
        this.setupPronouns()
//        this.pronouns()
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
//        this.btn_first.setOnClickListener(pronouns(btn))
    }

    fun pronouns(view: View){
        this.viewModel.retriveToBe().subscribe({toBe:List<String> ->
            // Toast.makeText(this, "Hola ${user.email}, has iniciado Sesión" , Toast.LENGTH_LONG).show()

//            Handler(Looper.getMainLooper()).post {
//                // your codes here run on main Thread
//                goToHome()
//            }

            this.txtFirstPronouns.text = toBe[0]
            this.txtSecondPronouns.text = toBe[1]
            this.txtThirdPronouns.text = toBe[2]
        },{error ->
//            Toast.makeText(this,error.message, Toast.LENGTH_LONG).show()
        })

    }

//    fun goTestPresent(view: View) {
//        this.button.setOnClickListener {
//            val intent
//        }
//    }
}
