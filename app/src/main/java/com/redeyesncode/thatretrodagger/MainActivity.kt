package com.redeyesncode.thatretrodagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.thatretrodagger.databinding.ActivityMainBinding
import com.redeyesncode.thatretrodagger.manualinjection.ManualInjectionActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        binding.btnDagger2.setOnClickListener {
            var intentDagger = Intent(this@MainActivity,ManualInjectionActivity::class.java)
            startActivity(intentDagger)


        }

        setContentView(binding.root)
    }



}

// Dagger is a framework for dependency injection just like hilt. we will see hilt in later parts
// RetroDagger.