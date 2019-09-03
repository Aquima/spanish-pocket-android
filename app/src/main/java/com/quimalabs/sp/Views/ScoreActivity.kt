package com.quimalabs.sp.Views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.quimalabs.sp.R
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        supportActionBar?.hide()

        //viewModel = ViewModelProviders.of(this).get()
        this.btn_present.setOnClickListener { val intent = Intent(this,PresentActivity::class.java)
            startActivity(intent)
        }
        this.btn_simple_past.setOnClickListener { val intent = Intent(this,SimplePastActivity::class.java)
            startActivity(intent)
        }
        this.btn_pas_imp.setOnClickListener { val intent = Intent(this,ImpPastActivity::class.java)
            startActivity(intent)
        }
        this.btn_future.setOnClickListener { val intent = Intent(this,FutureActivity::class.java)
            startActivity(intent)
        }
    }

    fun infoScores(view: View) {
        btn_info_score.visibility = View.GONE
    }
}
