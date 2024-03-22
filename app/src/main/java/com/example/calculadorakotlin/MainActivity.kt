package com.example.calculadorakotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadorakotlin.ui.theme.CalculadoraKotlinTheme

class MainActivity : ComponentActivity() {

    private lateinit var resultado: TextView;
    private var input: String = "";
    private var num1: Double = 0.0;
    private var num2: Double = 0.0;
    private var operador: Char = ' ';
    private val calculadora: Calculadora = Calculadora();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultado = findViewById(R.id.resultado);
    }

    fun botonNumeroClick(view: View) {
        val boton = view as Button
        val textoBoton = boton.text.toString()

        if (input == "0") {
            input = textoBoton
        } else {
            input += textoBoton
        }

        resultado.text = input
    }



    fun botonOperadorClick(view: View) {
        val boton = view as Button
        if (input.isNotEmpty()) {
            num1 = input.toDouble()
            operador = boton.text.toString()[0]

            // Mostrar num1, operador y un espacio en el TextView
            resultado.text = "$num1 $operador "

            // Reiniciar input para capturar num2
            input = ""
        }
    }



    fun puntoDecimalClick(view: View) {
        if (!input.contains(".")) {
            input += "."
            resultado.text = input
        }
    }


    fun botonIgualClick(view: View) {
        if (input.isNotEmpty()) {
            num2 = input.toDouble()
            var resultadoCalculado = 0.0

            when (operador) {
                '+' -> resultadoCalculado = calculadora.sumar(num1, num2)
                '-' -> resultadoCalculado = calculadora.restar(num1, num2)
                '×' -> resultadoCalculado = calculadora.multiplicar(num1, num2)
                '÷' -> resultadoCalculado = calculadora.dividir(num1, num2)
                '^' -> resultadoCalculado = calculadora.potencia(num1, num2.toInt())
                else -> resultadoCalculado = Double.NaN
            }

            input = resultadoCalculado.toString()

            if (resultadoCalculado.isNaN()) {
                resultado.text = "ERROR"
            } else {
                resultado.text = input
            }
        }
    }


    fun botonResetearClick(view: View){
        num1 = 0.0
        num2 = 0.0
        operador = ' '
        input = ""
        resultado.text = "0"
    }

    fun botonFibonacciClick(view: View) {
        if (input.isNotEmpty()) {
            val numeroFibonacci = input.toInt()

            val secuenciaFibonacci = calculadora.secuenciaFibonacci(numeroFibonacci)

            val intent = Intent(this, ActivityResultadoFibonacci::class.java)

            intent.putExtra("resultadoFibonacci", secuenciaFibonacci.toString())

            startActivity(intent)
        }
    }

    fun botonFactorialClick(view: View) {
        if (input.isNotEmpty()) {
            val numeroFactorial = input.toInt()

            val secuenciaFactorial = calculadora.secuenciaFactorial(numeroFactorial)

            val intent = Intent(this, ActivityResultadoFactorial::class.java)

            intent.putExtra("resultadoFactorial", secuenciaFactorial.toString())

            startActivity(intent)
        }
    }

}

