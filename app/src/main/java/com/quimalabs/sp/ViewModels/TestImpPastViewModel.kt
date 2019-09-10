package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import io.reactivex.Observable

class TestImpPastViewModel:ViewModel() {
    fun returnTestImpPast() : Observable<ArrayList<String>> {
        val observable: Observable<ArrayList<String>> = Observable.create { observer ->
            var list: ArrayList <String> = arrayListOf( "Responder", "Decidir", "Estudiar","Abrir","Aprender","Vivir")
            observer.onNext(list)
        }
        return observable
    }
    fun returnPronounImpPast(): Observable<ArrayList<String>> {
        val observable: Observable<ArrayList<String>> = Observable.create { observer ->
            var listPronouns: ArrayList<String> = arrayListOf("Nosotros","Ella","Yo","Ellas")
            observer.onNext(listPronouns)
        }
        return observable
    }
}