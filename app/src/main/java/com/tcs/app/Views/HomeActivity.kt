package com.tcs.app.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.tcs.app.R

class HomeActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        auth = FirebaseAuth.getInstance()

        this.signIn("jgomezvg@gmail.com","123456")
    }
    fun createAccount(email:String,password:String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                   // Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    Log.v("TAG_NOSE","user.mail = ${user?.email}")
                  //  updateUI(user)
                    Toast.makeText(this,"user.mail = ${user?.email}",Toast.LENGTH_LONG).show()
                } else {

                }

                // ...
            }
    }
    fun signIn(email:String,password:String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    val user = auth.currentUser
                    Log.v("TAG_NOSE","user.mail = ${user?.email}")
                    Toast.makeText(this,"user.mail = ${user?.email}",Toast.LENGTH_LONG).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.v("TAG_NOSE","no se logeo")

                }

                // ...
            }

    }
}
