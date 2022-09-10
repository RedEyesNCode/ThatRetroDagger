package com.redeyesncode.thatretrodagger.manualInjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.thatretrodagger.R

class ManualInjectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_injection)

        // Giving the manual dependency injection to it. by creating objects
        initManualInjection()
        initContructorInjection()
    }

    private fun initManualInjection() {
        val mainConnector = MainConnector()

        mainConnector.signUpAndSendEmail("redeyesncode@gmail.com","~~~222~~~","Android")



    }

    private fun initContructorInjection() {
        val  constructorInjection = ConstructorInjection(EmailProducer(), SignupProducer())
        constructorInjection.signUpAndSendEmail("redeyesncode@gmail.com","~~~222~~~","Android")


    }
}