package com.den.polyclinic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.den.polyclinic.databinding.ActivityTypesBinding

class TypesActivity : AppCompatActivity() {

    lateinit var binding: ActivityTypesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nurseButton.setOnClickListener {
            startActivity(Intent(this, NurseActivity::class.java))
        }

        binding.dentistButton.setOnClickListener {
            startActivity(Intent(this, DentistActivity::class.java))
        }

        binding.cosmetologistButton.setOnClickListener {
            startActivity(Intent(this, CosmetologistActivity::class.java))
        }
    }
}