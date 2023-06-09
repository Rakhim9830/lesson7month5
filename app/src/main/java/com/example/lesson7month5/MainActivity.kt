package com.example.lesson7month5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.lesson7month5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initclickers()
    }

    private fun initclickers() {
        with(binding){
            btnPlus.setOnClickListener {
                result.text = Math().add(edFm.text.toString(), scFm.text.toString())
            }
            btnDevide.setOnClickListener {
                result.text = Math().divide(edFm.text.toString(),scFm.text.toString())
            }
        }
    }
}