package com.example.schoolapp.registeration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.schoolapp.R
import com.example.schoolapp.databinding.RegisterationFragmentBinding
import com.example.schoolapp.viewmodelfactory.RegisterationVMFactory

class RegisterationFragment : Fragment() {

    lateinit var bindingVar: RegisterationFragmentBinding
    private lateinit var viewModel: RegisterationViewModel
    private lateinit var viewModelFactory: RegisterationVMFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingVar = DataBindingUtil.inflate(
            inflater,
            R.layout.registeration_fragment,
            container,
            false
        )

        viewModelFactory = RegisterationVMFactory("Student")
        viewModel = ViewModelProvider(this, viewModelFactory).get(RegisterationViewModel::class.java)
        viewModel.displayType()
        return bindingVar.root
    }
}