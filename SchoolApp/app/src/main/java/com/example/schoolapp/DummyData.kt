package com.example.schoolapp

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DummyData @Inject constructor() {
    var data = "abcd"
}