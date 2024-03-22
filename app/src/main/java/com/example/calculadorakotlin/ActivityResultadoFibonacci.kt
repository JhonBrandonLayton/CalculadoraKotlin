package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivityResultadoFibonacci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_fibonacci)

        val resultadoFibonacci = intent.getStringExtra("resultadoFibonacci")

        val textViewResultadoFibonacci = findViewById<TextView>(R.id.textViewResultadoFibonacci)

        textViewResultadoFibonacci.text = "Secuencia Fibonacci: $resultadoFibonacci"

        val regresarIcono = findViewById<ImageView>(R.id.regresarIcono)

        regresarIcono.setOnClickListener {
            onBackPressed()
        }

    }
}