package com.redeyesncode.thatretrodagger.manualInjection

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import javax.inject.Inject

class EmailProducer  {

    fun sendEmailUser(email:String ){
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $email")


    }
}