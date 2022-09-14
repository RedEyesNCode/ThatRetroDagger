package com.redeyesncode.thatretrodagger.dagger

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


//@Module
class InjectedProducer @Inject constructor() {
//
//    @Singleton
//    @Provides
    fun sendInjectedEmail(email:String ){
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $email")


    }


}