package com.example.calculadorakotlin

class Calculadora {

    fun sumar(num1: Double, num2: Double): Double{
        return num1+num2
    }

    fun restar(num1: Double, num2: Double): Double{
        return num1-num2
    }

    fun multiplicar(num1: Double, num2: Double): Double{
        return num1*num2
    }

    fun dividir(num1: Double, num2: Double): Double{
        if (num2 != 0.0){
            return num1/num2
        }else{
            return Double.NaN
        }
    }

    fun potencia(base: Double, exponente: Int): Double{
        if (exponente == 0){
            return 1.0
        }else if(exponente < 0){
            return 1 / (base*potencia(base, -exponente -1))
        }else{
            return base * potencia(base, exponente - 1)
        }
    }

    fun secuenciaFactorial(n: Int): List<Int>{
        val secuencia = mutableListOf<Int>();

        if (n < 0.0){
            return secuencia;
        }

        for (i in 0..n){
            secuencia.add(factorial(i));
        }

        return secuencia;
    }

    fun factorial(n: Int):Int {
        if (n < 0){
            return -1
        }else if(n == 0){
            return 1
        }else{
            return n * factorial(n - 1)
        }
    }

    fun secuenciaFibonacci(n: Int): List<Int>{
        val secuencia = mutableListOf<Int>()

        if (n < 0){
            return secuencia
        }

        for (i in 0..n){
            secuencia.add(fibonacci(i))
        }

        return secuencia;
    }

    fun fibonacci(n: Int): Int {
        if (n < 0) {
            return -1
        } else if (n == 0) {
            return 0
        } else if (n == 1) {
            return 1
        } else {
            val fibNMenos1 = fibonacci(n - 1)
            val fibNMenos2 = fibonacci(n - 2)
            return fibNMenos1 + fibNMenos2
        }
    }


}