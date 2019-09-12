package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.GlobalData
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import io.reactivex.Observable

class SimplePastViewModel: ViewModel() {
    var isFirstime:Boolean=false
    fun retrivePastSimple() : Observable<List<String>>{

        return Observable.create { observer ->
            val list =  listOf("É", "Í", "Í","ASTE","ISTE","ISTE","Ó","IÓ","IÓ","AMOS","IMOS","IMOS","ARON","IERON","IERON")
            observer.onNext(list)
        }
    }
    fun getPronounsForSimplePast(enum:EnumPronouns):List<DrawWord>{
        var drawWords:ArrayList<DrawWord> = ArrayList()
        GlobalData.listWordsToScoreViewData.map { word ->
            word.pronouns.map { pronouns ->
                if (pronouns.time=="past"){
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
