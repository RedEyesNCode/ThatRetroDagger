package com.redeyesncode.thatretrodagger.dagger

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import com.redeyesncode.thatretrodagger.MainActivity
import com.redeyesncode.thatretrodagger.daggerFutureReady.DaggerModule
import com.redeyesncode.thatretrodagger.manualinjection.ManualInjectionActivity
import dagger.Component


@Component(modules = [DaggerModule::class])
interface ProviderComponent {

    // Will contain all methods which provides us the objects.



    fun getInjectedProducer(): EmailInjectedProducer



    // This can be also a tedious task
// this will be solved by Dagger + Field Injection @Inject in the static vars in the UI Classes


    fun inject(uiActivity: ManualInjectionActivity){
        Log.i(Constants.DEV_SHEFALI,"INJECTING ~ ${ProviderComponent::class.java.simpleName}")

    }

}
