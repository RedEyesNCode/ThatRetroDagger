package com.redeyesncode.thatretrodagger.dagger

import com.redeyesncode.thatretrodagger.MainActivity
import com.redeyesncode.thatretrodagger.manualInjection.EmailProducer
import com.redeyesncode.thatretrodagger.manualInjection.SignupProducer
import dagger.Component
import dagger.Module
import dagger.Provides


@Component
@Module
interface MyDaggerComponent {

    // Will contain all methods which provides us the objects.

    fun getInjectedProducer(): InjectedProducer


    // This can be also a tedious task
// this will be solved by Dagger + Field Injection @Inject in the static vars in the UI Classes


    fun inject(mainActivity: MainActivity)

}