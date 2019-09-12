package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.GlobalData
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import io.reactivex.Observable

class FutureViewModel: ViewModel() {
    var isFirstime:Boolean = false
    fun retriveFuture() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("É", "É", "É","ÁS","ÁS","ÁS","Á","Á","Á","EMOS","EMOS","EMOS","ÁN","ÁN","ÁN")
            observer.onNext(list)
        }
        return observable
    }
    fun getPronounsForFuture(enum:EnumPronouns):List<DrawWord>{
        var drawWords:ArrayList<DrawWord> = ArrayList()
        GlobalData.listWordsToScoreViewData.map { word ->
            word.pronouns.map { pronouns ->
                if (pronouns.time=="future"){
                    var result = when(enum){
                        EnumPronouns.Yo -> pronouns.yo
                        EnumPronouns.Tu -> pronouns.tu
                        EnumPronouns.El -> pronouns.el
                        EnumPronouns.Nosotros -> pronouns.nosotros
                        EnumPronouns.Ellos -> pronouns.ellos
                    }
                    val drawWord = DrawWord(word.base,result)
                    drawWords.add(drawWord)
                }
            }
        }
        return drawWords
    }
}