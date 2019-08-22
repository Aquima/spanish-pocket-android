package com.quimalabs.sp.Models

import android.app.Activity
import com.google.firebase.auth.FirebaseAuth
import io.reactivex.Observable

class ApiClient {
    constructor(activity:Activity){
        this.auth = FirebaseAuth.getInstance()
        this.currentActivity = activity
    }
    private lateinit var currentActivity:Activity
    private lateinit var auth: FirebaseAuth

    fun signIn(email:String,password:String):Observable<WongUser>{
        val observable:Observable<WongUser> = Observable.create { observer ->
            this.auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this.currentActivity) { task ->
                if (task.isSuccessful) {

                    var email:String? = this.auth.currentUser?.email
                    var isEmailVerified:Boolean? = this.auth.currentUser?.isEmailVerified
                    if (email != null && isEmailVerified!= null){
                        val meUser = WongUser(email,isEmailVerified)
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

    fun createAccount(email:String,password:String):Observable<WongUser>{
        val observable:Observable<WongUser> = Observable.create { observer ->
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this.currentActivity) { task ->
                if(task.isSuccessful){

                    this.auth.currentUser?.sendEmailVerification()
                    var email:String? = this.auth.currentUser?.email
                    var isEmailVerified:Boolean? = this.auth.currentUser?.isEmailVerified
                    if(email != null && isEmailVerified != null){
                        val meUser = WongUser(email,isEmailVerified)
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
}