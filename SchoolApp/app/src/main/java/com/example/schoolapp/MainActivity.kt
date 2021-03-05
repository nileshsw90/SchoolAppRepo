package com.example.schoolapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.schoolapp.login.LoginFragment
import com.example.schoolapp.registeration.RegisterationFragment
import com.example.schoolapp.registeration.RegisterationViewModel
import com.example.schoolapp.room.Word
import com.example.schoolapp.viewmodelfactory.RegisterationVMFactory
import com.example.schoolapp.viewmodelfactory.WordVMFactory
import com.example.schoolapp.viewmodels.WordViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {


    var data = 0;
    private lateinit var viewModelFactory: WordVMFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        if(savedInstanceState == null)
        val bundle =
                bundleOf("firstName" to "Kunal", "lastNAme" to "Shetti", "course" to "android")
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, LoginFragment::class.java, bundle)
                .commit()
*/
//            supportFragmentManager.beginTransaction()
//                .setReorderingAllowed(true)
//                .add(R.id.fragment_container_view, RegisterationFragment::class.java, bundle)
//                .commit()
//    }


        viewModelFactory = WordVMFactory((application as MainApplication).repository)
        val wordViewModel = ViewModelProvider(this, viewModelFactory).get(WordViewModel::class.java)

        wordViewModel.allWords.observe(this, Observer { it -> Log.i("Livesdata", it[0].mWord) })

        wordViewModel.insert(Word("Hello World"))
    }

}