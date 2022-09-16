package com.redeyesncode.thatretrodagger.daggerFutureReady

import android.util.Log
import com.redeyesncode.thatretrodagger.Constants
import javax.inject.Inject

// In order to solve this hard corded type problem we make modules , interface and use @Provides annotation

interface ServerPicker{

    fun sendLooseCoupledEmail(email:String )
    fun sendInputFromUserEmail()



}


class LogCatService @Inject constructor(val emailFromUser: String) : ServerPicker{

    override fun sendInputFromUserEmail() {
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $emailFromUser LogCatService")

    }

    override fun sendLooseCoupledEmail(email: String) {
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $email LogCatService")
    }
}
class FcmService @Inject constructor(val emailFromUser: String) : ServerPicker{


    override fun sendInputFromUserEmail() {
        Log.i(Constants.DEV_SHEFALI,"Success Email sended to $emailFromUser LogCatService")
    }

    override fun sendLooseCoupledEmail(email: String) {
        Log.i(Constants.DEV_SHEFALI,"Success FCM SERVICE sended to $email")

    }
}