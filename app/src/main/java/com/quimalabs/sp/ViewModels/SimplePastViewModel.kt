package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import io.reactivex.Observable

class SimplePastViewModel: ViewModel() {
    fun retriveToBe() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("É", "Í", "Í","ASTE","ISTE","ISTE","Ó","IÓ","IÓ","AMOS","IMOS","IMOS","ARON","IERON","IERON")

            observer.onNext(list)
        }
        return observable

    }
}