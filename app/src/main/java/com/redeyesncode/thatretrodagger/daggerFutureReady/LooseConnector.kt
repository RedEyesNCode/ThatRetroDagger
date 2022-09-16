package com.redeyesncode.thatretrodagger.daggerFutureReady

import com.redeyesncode.thatretrodagger.dagger.EmailInjectedProducer
import com.redeyesncode.thatretrodagger.dagger.MessageInjectedProducer
import javax.inject.Inject

class LooseConnector @Inject constructor(
    private val logCatService: ServerPicker,
    private val messageInjectedProducer: MessageInjectedProducer

) {

    fun sendMessageAndSaveUser(){
        logCatService.sendLooseCoupledEmail("redeyesncode@gmail.com")
        messageInjectedProducer.sendInjectedMessage("Your Message here ","Message Body is here.")

    }
}