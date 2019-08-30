package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import io.reactivex.Observable

class FutureViewModel: ViewModel() {
    fun retriveFuture() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("É", "É", "É","ÁS","ÁS","ÁS","Á","Á","Á","EMOS","EMOS","EMOS","ÁN","ÁN","ÁN")

            observer.onNext(list)
        }
        return observable

    }
}