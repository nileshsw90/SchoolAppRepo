package com.example.schoolapp

import androidx.fragment.app.Fragment
import javax.inject.Inject

class DumyModalWithActivity @Inject constructor(private val fragment: Fragment) {

    var frag = fragment
}