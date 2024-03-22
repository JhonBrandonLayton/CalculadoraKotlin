package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivityResultadoFactorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_factorial)

        val resultadoFactorial = intent.getStringExtra("resultadoFactorial")

        val textViewResultadoFactorial = findViewById<TextView>(R.id.textViewResultadoFactorial)

        textViewResultadoFactorial.text = "Secuencia Factorial: $resultadoFactorial"

        val regresarIcono = findViewById<ImageView>(R.id.regresarIcono)

        regresarIcono.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

    }
}