package com.quimalabs.sp.ViewModels

import androidx.lifecycle.ViewModel
import com.quimalabs.sp.Models.GlobalData
import com.quimalabs.sp.ViewModels.Enumerators.EnumPronouns
import io.reactivex.Observable

class PresentViewModel: ViewModel() {
    var isFirstime:Boolean = false
    fun retriveToBe() : Observable<List<String>>{

        val observable:Observable<List<String>> = Observable.create { observer ->
            val list =  listOf("O", "O", "O","AS","ES","ES","A","E","E","AMOS","EMOS","IMOS","AN","EN","EN")
            observer.onNext(list)
        }
        return observable
    }
    fun getPronounsForPresent(enum:EnumPronouns):List<DrawWord> {
       var drawWords:ArrayList<DrawWord> = ArrayList()
        GlobalData.listWordsToScoreViewData.map { word ->
            word.pronouns.map { pronouns ->
                if (pronouns.time == "present" ){
                    var result = when(enum) {
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
class DrawWord(var base: String = "", var variant:String = ""){
}