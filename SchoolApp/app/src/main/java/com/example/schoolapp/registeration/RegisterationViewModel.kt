package com.example.schoolapp.registeration

import android.util.Log
import androidx.lifecycle.ViewModel

class RegisterationViewModel(type: String) : ViewModel(){

    var userType = type

    init{
        Log.i("RegisterationViewModel", "Viewmodel created")
    }

    fun displayType(){
        Log.i("RegisterationViewModel", userType)
    }

}