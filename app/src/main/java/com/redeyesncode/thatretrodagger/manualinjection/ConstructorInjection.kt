package com.redeyesncode.thatretrodagger.manualinjection

class ConstructorInjection(val emailProducer: EmailProducer, val signupProducer: SignupProducer) {


    // Getting all the required dependency from the constructor
    fun signUpAndSendEmail(email:String,userName:String,password:String){
        emailProducer.sendEmailUser(email)
        signupProducer.signUpUser(userName,password)

    }



}