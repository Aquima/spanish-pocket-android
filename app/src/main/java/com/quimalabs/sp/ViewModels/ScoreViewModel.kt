package com.quimalabs.sp.ViewModels

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.ApiClient
import com.quimalabs.sp.Models.GlobalData
import com.quimalabs.sp.Models.Pronouns
import com.quimalabs.sp.Models.Word
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class ScoreViewModel: ViewModel() {
    lateinit var apiClient: ApiClient
    fun returnScores() : Observable<List<String>>{
        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("1", "2", "3","4")
            observer.onNext(list)
        }
        return observable
    }
    fun getWords(activity: Activity):Observable<Word>{
        this.apiClient = ApiClient(activity)
        return apiClient.getWords()
    }
    private fun getPronouns(activity: Activity,word: Word,time:String):Observable<Pronouns>{
        this.apiClient = ApiClient(activity)
        return apiClient.getTimeWords(time,word)
    }
    var listWords:ArrayList<Word> = ArrayList()

    fun getWordsWithPronouns(activity: Activity,word:Word):Observable<Boolean>{
        listWords.add(word)
        var intCounterIteration = 0
        val observableCompleted:Observable<Boolean> = Observable.create { observer ->
            val times:List<String> = listOf("present","past","past imperfect","future")
            var listPronouns:ArrayList<Pronouns> = ArrayList()
            var intTotalIteration = times.size

            for ( time in times){

                val observablePronouns: Observable<Pronouns> = this.getPronouns(activity,word,time)
                observablePronouns.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { pronouns ->
                            Log.d("spocket",pronouns.ustedes)
                            Log.d("spocket",pronouns.uid)
                            listPronouns.add(pronouns)
                        },
                        { error ->
                            Log.d("error", error.message)
                        },{
                            //onComplete

                            word.pronouns = listPronouns
                            intCounterIteration+=1
                            if(intCounterIteration == intTotalIteration){
                                // on completed all data
                                observer.onNext(true)
                                observer.onComplete()
                                Log.d("spocket", listPronouns.size.toString())
                            }
                        }
                    )
            }
        }
        return  observableCompleted
    }
    fun saveData(){
        GlobalData.listWordsToScoreViewData = this.listWords
    }
}
