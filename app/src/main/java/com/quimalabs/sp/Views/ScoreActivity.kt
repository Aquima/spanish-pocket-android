package com.quimalabs.sp.Views

import androidx.lifecycle.ViewModelProvider
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.quimalabs.sp.Models.Word
import com.quimalabs.sp.R
import com.quimalabs.sp.ViewModels.ScoreViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {
    lateinit var viewModel:ScoreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        supportActionBar?.hide()

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(ScoreViewModel::class.java)
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
        this .setUp()
    }
    fun setUp(){
        val observableWord = viewModel.getWors(this).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { word ->
                    Log.d("spocket",word.base)
                    Log.d("spocket",word.uid)
                    this.getPronouns(word)
                },
                { error ->
                    Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show()
                }
            )
        observableWord
    }
    fun getPronouns(word:Word){
        val observablePronouns = viewModel.getPronouns(this,word,"present").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { pronouns ->
                    Log.d("spocket",pronouns.ustedes)
                    Log.d("spocket",pronouns.uid)
                },
                { error ->
                    Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show()
                }
            )
        observablePronouns
    }
    fun infoScores(view: View) {
        btn_info_score.visibility = View.GONE
    }
}
