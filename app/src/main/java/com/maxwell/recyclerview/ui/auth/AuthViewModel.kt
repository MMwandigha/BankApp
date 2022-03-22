package com.maxwell.recyclerview.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {

    var phoneNumber: Int? = null
    var password: String? = null

    var authListener : AuthListener? = null

    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if (phoneNumber.toString().isEmpty() || password.isNullOrEmpty() ){
            authListener?.onFailure("Invalid email or password")
            return
        }

        authListener?.onSuccess()
        //success
    }
}
