package com.quimalabs.sp.Models

class WongUser {
    constructor(email:String,isVerified:Boolean){
        this.isVerified = isVerified
        this.email = email
    }
    lateinit var email:String
    val isVerified:Boolean
}