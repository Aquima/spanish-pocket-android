package com.quimalabs.sp.Models

import android.app.Activity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

import io.reactivex.Observable

class ApiClient {
    constructor(activity:Activity){
        this.auth = FirebaseAuth.getInstance()
        this.currentActivity = activity//reference activity
    }
    private lateinit var currentActivity:Activity
    private lateinit var auth: FirebaseAuth
    val db = FirebaseFirestore.getInstance()

    fun signIn(email:String,password:String):Observable<SPUser>{
        val observable:Observable<SPUser> = Observable.create { observer ->
            this.auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this.currentActivity) { task ->
                if (task.isSuccessful) {

                    var email:String? = this.auth.currentUser?.email
                    var isEmailVerified:Boolean? = this.auth.currentUser?.isEmailVerified
                    if (email != null && isEmailVerified!= null){
                        val meUser = SPUser(email,isEmailVerified)
                        observer.onNext(meUser)
                        observer.onComplete()
                    }
                } else {

                    val error:Throwable = Throwable("el email y password son incorrectos",null)
                    observer.onError(error)
                }
            }
        }
        return observable
    }

    fun createAccount(email:String,password:String):Observable<SPUser>{
        val observable:Observable<SPUser> = Observable.create { observer ->
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this.currentActivity) { task ->
                if(task.isSuccessful){

                    this.auth.currentUser?.sendEmailVerification()
                    var email:String? = this.auth.currentUser?.email
                    var isEmailVerified:Boolean? = this.auth.currentUser?.isEmailVerified
                    if(email != null && isEmailVerified != null){
                        val meUser = SPUser(email,isEmailVerified)
                        observer.onNext(meUser)
                        observer.onComplete()
                    }
                }
                else{
                    val error:Throwable = Throwable("No se pudo crear la cuenta",null)
                    observer.onError(error)
                }
            }
        }
        return  observable
    }
    fun getWords(): Observable<Word> {
        val TAG = "spocket"
        val observable:Observable<Word> = Observable.create { observer ->
            db.collection("words")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        val newWord = document.toObject(Word::class.java)
                        newWord.uid = document.id
                        observer.onNext(newWord)
                    }
                    observer.onComplete()
                }
                .addOnFailureListener { exception ->
                    Log.w(TAG, "Error getting documents.", exception)
                }
        }
        return  observable
    }
    /*
    params:
    time: present, future, past imperfect, past
     */
    fun getTimeWords(time:String,word: Word): Observable<Pronouns> {
        val TAG = "spocket"
        val observable:Observable<Pronouns> = Observable.create { observer ->
            db.collection("/words/${word.uid}/${time}")///words/F6pHdu6nbJhXfHrY0FCq/present
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        val newPronouns = document.toObject(Pronouns::class.java)
                        newPronouns.uid = document.id
                        newPronouns.time = time
                        observer.onNext(newPronouns)
                    }
                    observer.onComplete()
                }
                .addOnFailureListener { exception ->
                    Log.w(TAG, "Error getting documents.", exception)
                }
        }
        return  observable
    }
}
//data class MyObject(var foo: String = "")
data class Word(var base: String = "") {
    lateinit var uid:String
    var pronouns:ArrayList<Pronouns> = ArrayList()
}
data class Pronouns(var el: String = "",
                    var ella: String  = "",
                    var ellas: String  = "",
                    var ellos: String  = "",
                    var nosotros: String  = "",
                    var tu: String  = "",
                    var usted: String  = "",
                    var ustedes: String  = "",
                    var yo: String  = "") {
    lateinit var uid:String
    lateinit var time:String
}