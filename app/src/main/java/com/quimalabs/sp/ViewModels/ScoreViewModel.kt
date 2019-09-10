package com.quimalabs.sp.ViewModels

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.ApiClient
import com.quimalabs.sp.Models.Pronouns
import com.quimalabs.sp.Models.Word
import io.reactivex.Observable


class ScoreViewModel: ViewModel() {
    lateinit var apiClient: ApiClient
    fun returnScores() : Observable<List<String>>{
        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("1", "2", "3","4")

            observer.onNext(list)
        }
        return observable
    }
    fun getWors(activity: Activity):Observable<Word>{
        this.apiClient = ApiClient(activity)
        return apiClient.getWords()
    }
    fun getPronouns(activity: Activity,word: Word,time:String):Observable<Pronouns>{
        this.apiClient = ApiClient(activity)
        return apiClient.getTimeWords(time,word)
    }
}
