package com.redeyesncode.thatretrodagger.manualinjection

class MainConnector {

    // Creating a viewmodel type of structure calling the api calling classes from here.

    private val emailProducer:EmailProducer = EmailProducer()
    private val signupProducer:SignupProducer = SignupProducer()


    fun signUpAndSendEmail(email:String,userName:String,password:String){
        emailProducer.sendEmailUser(email)
        signupProducer.signUpUser(userName,password)

    }




}