package com.quimalabs.sp.ViewModels

import android.arch.lifecycle.ViewModel
import io.reactivex.Observable

class TestPresentViewModel: ViewModel() {
    fun returnTestPresent() : Observable<ArrayList<String>>{
        val observable:Observable<ArrayList<String>> = Observable.create { observer ->
            var list: ArrayList <String> = arrayListOf( "Llamar", "Limpiar", "Cocinar","Planchar","Extrañar","Fusionar")
            observer.onNext(list)
        }
        return observable
    }
}
