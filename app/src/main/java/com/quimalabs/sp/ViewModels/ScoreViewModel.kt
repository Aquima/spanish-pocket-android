package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import io.reactivex.Observable


class ScoreViewModel: ViewModel() {
    fun returnScores() : Observable<List<String>>{
        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("1", "2", "3","4")

            observer.onNext(list)
        }
        return observable
    }
}
