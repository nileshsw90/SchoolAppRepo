package com.example.schoolapp.data.model

data class RegisterModel(
    val name: String,
    val age: Int,
    val roll: Int,
    val typeOfUser: String,
    val userAddrress: String
) {

    var userName: String = name
    private var userAge: Int = age
    private var userRoll: Int = roll
    private var userType: String = typeOfUser
    private var userAddr: String = userAddrress

}