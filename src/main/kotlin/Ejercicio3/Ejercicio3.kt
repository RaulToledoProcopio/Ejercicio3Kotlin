package org.example.Ejercicio3

fun Ejercicio3() {
        val juego = SitemaJuego()
        var opcion: Int? = null

        while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.
            println("Elige una opción:")
            println("1. Crear Guerrero")
            println("2. Crear Mago")
            println("3. Mostrar personajes")
            println("4. Realizar acción")
            println("0. Salir")

            print("Elige una opción: ")
            opcion = readLine()?.toIntOrNull()

            when (opcion) {
                1 -> juego.crearGuerrero()
                2 -> juego.crearMago()
                3 -> juego.mostrarPersonajes()
                4 -> juego.realizarAccion()
                0 -> println("Saliendo...")
                else -> println("Elige una opción válida")
            }
        }
    }