package com.redeyesncode.thatretrodagger.dagger

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import javax.inject.Inject

class InjectedProducer @Inject constructor() {

    fun sendInjectedEmail(email:String ){
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $email")


    }


}