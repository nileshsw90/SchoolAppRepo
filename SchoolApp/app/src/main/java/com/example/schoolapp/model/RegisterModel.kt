package com.example.schoolapp.model

data class RegisterModel(val name: String) {

    var myName: String = name
    private var age: Int = 0
    private var roll: Int = 0
    private var userType: String? = null
    private var userAddr: String? = null

    constructor(age: Int, myName: String) : this(myName) {
        this.age = age
    }

    constructor(age: Int, myName: String, roll: Int) : this(age, myName) {
        this.roll = roll
    }

    constructor(age: Int, myName: String, roll: Int, userType: String) : this(age, myName, roll) {
        this.userType = userType
    }

    constructor(age: Int, myName: String, roll: Int, userType: String, userAddr: String) : this(
        age,
        myName,
        roll,
        userType
    ) {
        this.userAddr = userAddr
    }

}