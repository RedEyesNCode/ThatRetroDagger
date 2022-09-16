package com.redeyesncode.thatretrodagger.dagger

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import javax.inject.Inject




class MessageInjectedProducer @Inject constructor() {

    fun sendInjectedMessage(message:String,body:String){
        Log.i(Constants.DEV_SHEFALI, "sendInjectedMessage: $message & $body")

    }


}