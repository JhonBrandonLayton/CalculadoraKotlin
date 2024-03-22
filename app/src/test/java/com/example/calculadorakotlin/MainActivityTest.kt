package com.example.calculadorakotlin

import org.junit.Test
import org.junit.Assert.*

class MainActivityTest{
    @Test
    fun testSuma() {
        val calculadora = Calculadora()
        val resultado = calculadora.sumar(2.0, 3.0)
        assertEquals(5.0, resultado, 0.001)
    }

    @Test
    fun testSuma2() {
        val calculadora = Calculadora()
        val resultado = calculadora.sumar(8.0, 3.0)
        assertEquals(11.0, resultado, 0.001)
    }

    @Test
    fun testResta() {
        val calculadora = Calculadora()
        val resultado = calculadora.restar(5.0, 2.0)
        assertEquals(3.0, resultado, 0.001)
    }

    @Test
    fun testMultiplicacion() {
        val calculadora = Calculadora()
        val resultado = calculadora.multiplicar(5.0, 2.0)
        assertEquals(10.0, resultado, 0.001)
    }

    @Test
    fun testDivision() {
        val calculadora = Calculadora()
        val resultado = calculadora.dividir(6.0, 2.0)
        assertEquals(3.0, resultado, 0.001)
    }

    @Test
    fun testPotencia() {
        val calculadora = Calculadora()
        val resultado = calculadora.potencia(2.0, 3)
        assertEquals(8.0, resultado, 0.001)
    }

    @Test
    fun testSecuenciaFibonacci() {
        val calculadora = Calculadora()

        val secuencia0 = calculadora.secuenciaFibonacci(0)
        assertEquals(listOf(0), secuencia0)

        val secuencia1 = calculadora.secuenciaFibonacci(1)
        assertEquals(listOf(0, 1), secuencia1)

        val secuencia5 = calculadora.secuenciaFibonacci(5)
        assertEquals(listOf(0, 1, 1, 2, 3, 5), secuencia5)
    }

    @Test
    fun testFactorial() {
        val calculadora = Calculadora()

        val resultadoSF0 = calculadora.secuenciaFactorial(0)
        assertEquals(listOf(1), resultadoSF0)

        val resultadoSF1 = calculadora.secuenciaFactorial(1)
        assertEquals(listOf(1, 1), resultadoSF1)

        val resultadoSF3 = calculadora.secuenciaFactorial(3)
        assertEquals(listOf(1, 1, 2, 6), resultadoSF3)

        val resultadoSF5 = calculadora.secuenciaFactorial(5)
        assertEquals(listOf(1, 1, 2, 6, 24, 120), resultadoSF5)

        val resultadoSF7 = calculadora.secuenciaFactorial(7)
        assertEquals(listOf(1, 1, 2, 6, 24, 120, 720, 5040), resultadoSF7)
    }
}
