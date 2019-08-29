package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import io.reactivex.Observable

class ImpPastViewModel:ViewModel() {
    fun retriveToBe() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("ABA", "ÍA", "ÍA","ABAS","ÍAS","ÍAS","ABA","ÍA","ÍA","ÁBAMOS","ÍAMOS","ÍAMOS","ABAN","ÍAN","ÍAN")

            observer.onNext(list)
        }
        return observable

    }
}