package com.redeyesncode.thatretrodagger.dagger

import javax.inject.Inject


//Constant.DEV_ASHUTOSH

// In this way the classes are tightly coupled they are not future ready in case if want
// to use other emailService or messageService coz it's hard-coded.
// This problem will be solved by creating a interface in the repository classes & then creating
// a module class which contains method to provide certain implementation for that method.
class InjectedConnector @Inject constructor(
    private val emailInjectedProducer:EmailInjectedProducer,
    private val messageInjectedProducer:MessageInjectedProducer

) {

    fun sendMessageAndSaveUser(){
        emailInjectedProducer.sendInjectedEmail("redeyesncode@gmail.com")
        messageInjectedProducer.sendInjectedMessage("Your Message here ","Message Body is here.")

    }






}