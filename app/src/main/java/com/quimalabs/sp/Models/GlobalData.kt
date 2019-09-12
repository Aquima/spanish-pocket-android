package com.quimalabs.sp.Models

object GlobalData {
    lateinit var listWordsToScoreViewData:List<Word>
    init {
        println("Singleton invoked")
    }
}
