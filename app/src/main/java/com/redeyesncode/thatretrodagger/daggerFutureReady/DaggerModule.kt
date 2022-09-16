package com.redeyesncode.thatretrodagger.daggerFutureReady

import dagger.Module
import dagger.Provides


@Module
class DaggerModule(private val email:String) {


    // We have created this module to remove the dependency for the LogcatService.

    // Passing the values at runtime from Ui as well
    @Provides
    fun getLogcatService():LogCatService{
        return LogCatService(email)

    }


}