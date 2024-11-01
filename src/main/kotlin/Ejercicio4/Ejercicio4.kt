package org.example.Ejercicio4

fun Ejercicio4() {

        val profesor = Profesor()
        var opcion: Int?

        do {
            println("Elige una opción")
            println("1. Agregar estudiante")
            println("2. Asignar curso a estudiante")
            println("3. Agregar nota a estudiante")
            println("4. Calcular nota media del estudiante")
            println("0. Salir")

            opcion = readLine()?.toIntOrNull() // Leer opción del usuario

            when (opcion) {
                1 -> profesor.agregarEstudiante()
                2 -> profesor.agregarCurso()
                3 -> profesor.agregarCalificacion()
                4 -> profesor.calcularNotaMedia()
                0 -> println("Saliendo...")
                else -> println("Elige una opción válida")
            }
        } while (opcion != 0)
    }