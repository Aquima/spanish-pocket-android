package com.quimalabs.sp.Models

class SPUser {
    constructor(email:String,isVerified:Boolean){
        this.isVerified = isVerified
        this.email = email
    }
    lateinit var email:String
    val isVerified:Boolean
}