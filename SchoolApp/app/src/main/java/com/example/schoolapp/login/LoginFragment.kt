package com.example.schoolapp.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.schoolapp.DummyData
import com.example.schoolapp.DumyModalWithActivity
import com.example.schoolapp.R
import com.example.schoolapp.databinding.LoginFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment() {

    lateinit var bindingVar: LoginFragmentBinding

    @Inject lateinit var dummyData: DumyModalWithActivity
    lateinit var loginViewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("LoginViewModel", "Called ViewModelProvider.get")
            bindingVar = DataBindingUtil.inflate(
            inflater,
            R.layout.login_fragment,
            container,
            false
        )


        var boolData = (this == dummyData.frag)
        Log.i("Dagger", boolData.toString())
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        return bindingVar.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingVar.fragment = this
        bindingVar.firstname = arguments?.getString("firstName")
//        bindingVar.lastName = requireArguments().getString("lastName")
//        bindingVar.course = requireArguments().getString("course")

    }


    fun onClicked() {
        loginViewModel.increaseCount()
        Toast.makeText(activity, "${loginViewModel.loginCount}", Toast.LENGTH_SHORT).show()
    }

}