package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import io.reactivex.Observable

class PresentViewModel: ViewModel() {
    fun retriveToBe() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("O", "O", "O","AS","ES","ES","A","E","E","AMOS","EMOS","IMOS","AN","EN","EN")

            observer.onNext(list)
        }
        return observable

    }
}