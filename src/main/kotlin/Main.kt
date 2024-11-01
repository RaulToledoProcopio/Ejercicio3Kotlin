package org.example

import org.example.Ejercicio1.Ejercicio1
import org.example.Ejercicio2.Ejercicio2
import org.example.Ejercicio3.Ejercicio3
import org.example.Ejercicio4.Ejercicio4
import org.example.Ejercicio5.Ejercicio5

fun main() { //
    var opcion: Int? = null // Inicialización de la variable que almacenará la opción del menú.

    while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.

        println("Menú:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("0. Salir")

        print("Elige una opción:")

        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> {
                println("Ejecutando el Ejercicio 1...\n")
                Ejercicio1()
            }

            2 -> {
                println("Ejecutando el Ejercicio 2...\n")
                Ejercicio2()
            }

            3 -> {
                println("Ejecutando el Ejercicio 3...\n")
                Ejercicio3()
            }

            4 -> {
                println("Ejecutando el Ejercicio 4...\n")
                Ejercicio4()
            }

            5 -> {
                println("Ejecutando el Ejercicio 5...\n")
                Ejercicio5()
            }

            0 -> println("Saliendo")
            else -> println("Elige una opción válida")
        }
    }
}