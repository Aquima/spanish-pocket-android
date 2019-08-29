package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import com.quimalabs.sp.ViewModels.Enumerators.Pronouns
import io.reactivex.Observable

class PresentViewModel: ViewModel() {
    fun retriveToBe() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("O", "O", "O")

            observer.onNext(list)
        }
        return observable
    }
}