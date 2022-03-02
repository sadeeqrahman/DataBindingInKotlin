package com.encoders.databindinginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.encoders.databindinginkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.surname.text = "Rahman"
//        binding.username.text = "Sadeeq Rahman"

        val sadeeq = Sadeeq("Sadeeq Rahman (Android Developer)","Rahman")
        binding.sadeeq = sadeeq



    }
}