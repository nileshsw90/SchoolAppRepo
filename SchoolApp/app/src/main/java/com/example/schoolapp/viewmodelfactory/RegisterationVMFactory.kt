package com.example.schoolapp.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.schoolapp.registeration.RegisterationViewModel

class RegisterationVMFactory(var type: String) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(RegisterationViewModel::class.java)){
            return RegisterationViewModel(type) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}