package com.example.schoolapp.login

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    init {
        Log.i("LoginViewModel", "LoginViewModel created!")
    }

    //    Right before the ViewModel is destroyed, the onCleared() callback is called to clean up the resources.
    override fun onCleared() {
        super.onCleared()
        Log.i("LoginViewModel", "LoginViewModel destroyed!")
    }

    var loginCount = 0

    fun increaseCount(){
        loginCount++
    }


}