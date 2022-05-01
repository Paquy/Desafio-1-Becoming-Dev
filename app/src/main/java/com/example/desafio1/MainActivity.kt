package com.example.desafio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Bottun Functions
        binding.btTexto1.setOnClickListener(){
            if(binding.txtEu.text == "EU"){
                binding.txtEu.text = "__"
                binding.btTexto1.text = "BOTÃO 1"
            }else{
                binding.txtEu.text = "EU"
                binding.btTexto1.text = "EU"
            }
        }
        binding.btTexto2.setOnClickListener(){
            if( binding.txtVou.text == "VOU"){
                binding.txtVou.text = "___"
                binding.btTexto2.text = "BOTÃO 2"
            }else{
                binding.txtVou.text = "VOU"
                binding.btTexto2.text = "VOU"
            }
        }
        binding.btTexto3.setOnClickListener(){
            if( binding.txtVirar.text == "VIRAR"){
                binding.txtVirar.text = "_____"
                binding.btTexto3.text = "BOTÃO 3"
            }else{
                binding.txtVirar.text = "VIRAR"
                binding.btTexto3.text = "VIRAR"
            }
        }
        binding.btTexto4.setOnClickListener(){
            if( binding.txtDev.text == "DEV"){
                binding.txtDev.text = "___"
                binding.btTexto4.text = "BOTÃO 4"
            }else{
                binding.txtDev.text = "DEV"
                binding.btTexto4.text = "DEV"
            }
        }
    }
}