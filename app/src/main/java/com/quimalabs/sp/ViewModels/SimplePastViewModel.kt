package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import io.reactivex.Observable

class SimplePastViewModel: ViewModel() {
    fun retrivePastSimple() : Observable<List<String>>{

        return Observable.create { observer ->
            val list =  listOf("É", "Í", "Í","ASTE","ISTE","ISTE","Ó","IÓ","IÓ","AMOS","IMOS","IMOS","ARON","IERON","IERON")
            observer.onNext(list)
        }
    }
}