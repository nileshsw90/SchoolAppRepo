package com.example.schoolapp.di.modules

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.schoolapp.DumyModalWithActivity
import com.example.schoolapp.login.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class LoginFragmentModule {

    @Provides
    fun provideDummyModel(fragment: Fragment): DumyModalWithActivity {
        return DumyModalWithActivity(fragment)
    }

}