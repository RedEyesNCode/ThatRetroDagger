package com.redeyesncode.thatretrodagger.manualinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.redeyesncode.thatretrodagger.MainActivity
import com.redeyesncode.thatretrodagger.R
import com.redeyesncode.thatretrodagger.dagger.DaggerProviderComponent
import com.redeyesncode.thatretrodagger.dagger.EmailInjectedProducer
import com.redeyesncode.thatretrodagger.dagger.InjectedConnector
import com.redeyesncode.thatretrodagger.daggerFutureReady.DaggerModule
import com.redeyesncode.thatretrodagger.daggerFutureReady.LogCatService
import com.redeyesncode.thatretrodagger.daggerFutureReady.LooseConnector
import com.redeyesncode.thatretrodagger.databinding.ActivityManualInjectionBinding
import javax.inject.Inject

class ManualInjectionActivity : AppCompatActivity() {


    // Field Injection this requires fun inject method inside the @Component Interface
    @Inject
    lateinit var injectedProducer: EmailInjectedProducer

    @Inject
    lateinit var logCatService: LogCatService


    lateinit var binding:ActivityManualInjectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManualInjectionBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initClicks()
        // Giving the manual dependency injection to it. by creating objects

        //Dagger is intialzed inside the class itself.

    }

    private fun initClicks() {
        binding.btnManualInjection.setOnClickListener {
            Snackbar.make(binding.root,"MANUAL INJECTION COMPLETE",Snackbar.LENGTH_LONG).show()
            initManualInjection()

        }
        binding.btnConstructionInjection.setOnClickListener {

            Snackbar.make(binding.root,"CONSTRUCTOR INJECTION COMPLETE",Snackbar.LENGTH_LONG).show()
            initConstructorInjection()

        }
        binding.btnDaggerCall.setOnClickListener {

            Snackbar.make(binding.root,"ThatRetroDagger",Snackbar.LENGTH_LONG).show()
            InjectDagger()

        }


    }

    fun InjectDagger() {
        // Simple Dagger Builder


//        val daggerComponent = DaggerProviderComponent



//          Once dagger know it has modules which have contructor or values that are being generated at runtime then you will always need to gather some
        // the builder class as well for it.
//        val daggerComponent = DaggerProviderComponent.builder().build()
        // This can be a tedious procedure also
        // to solve this we can inject the consumer to component itself.

//        daggerComponent.getInjectedProducer().sendInjectedEmail("redeyesncode@gmail.com")


        // This will tell dagger to import all the fields which have the @Inject annotation.
//        daggerComponent.inject(this)

//        injectedProducer.sendInjectedEmail("DagMeEveryTime@Github.com")


        // Dagger automatically created the injected connector object and makes it not null.
//        injectedConnector.sendMessageAndSaveUser()


        // Dagger injected from the modules.

        // Once the modules has been initialized dagger then make call also in the builder classes as well.


        // Passing the values to dagger at runtime

        val daggerWithModuleComponent = DaggerProviderComponent.builder().daggerModule(DaggerModule(binding.edtData.text.toString())).build()
        daggerWithModuleComponent.inject(this)

        logCatService.sendInputFromUserEmail()









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