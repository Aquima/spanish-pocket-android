package com.tcs.app

import com.tcs.app.Models.LogInModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun validate_email() {

        val logInModel = LogInModel()
        val email:String = "alberto@gmail.com"
        assertTrue("Es valido",logInModel.validateMail(email))
        val badEmail:String = "albertó@gmail.com"
        assertFalse("Es invalido",logInModel.validateMail(badEmail))
    }
    @Test
    fun validate_password(){
        val logInModel = LogInModel()
        val password = "123456"
        assertTrue("es valido",logInModel.validatePassword(password))
        val bad_password = "12345"
        assertFalse("no es valido",logInModel.validatePassword(bad_password))
    }
}
