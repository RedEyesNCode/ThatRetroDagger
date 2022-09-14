package com.redeyesncode.thatretrodagger.manualInjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.thatretrodagger.R
import dagger.internal.DaggerCollections

class ManualInjectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_injection)

        // Giving the manual dependency injection to it. by creating objects
        initManualInjection()

        initConstructorInjection()
        InjectDagger()

    }

    class InjectDagger {
        // Simple Dagger Builder
        // Builder class is not coming

//        :(






    }

    private fun initManualInjection() {
        val mainConnector = MainConnector()
        // Bigger code base ? this will be tedious task for you trust me !

        mainConnector.signUpAndSendEmail("redeyesncode@gmail.com","~~~222~~~","Android")



    }

    private fun initConstructorInjection() {
        val  constructorInjection = ConstructorInjection(EmailProducer(), SignupProducer())
        constructorInjection.signUpAndSendEmail("redeyesncode@gmail.com","~~~222~~~","Android")


    }
}