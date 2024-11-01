package org.example.Ejercicio5

fun Ejercicio5() {

    val usuario = Usuario() // Crear un usuario
    var opcion: Int? // Variable para almacenar la opción elegida

    do {
        println("Elige una opción: ")
        println("1. Crear Proyecto")
        println("2. Añadir Tarea al Proyecto")
        println("3. Marcar Tarea como Completada")
        println("0. Salir")

        opcion = readLine()?.toIntOrNull() // Leer opción del usuario

        when (opcion) {
            1 -> {
                print("Introduce el nombre del proyecto: ")
                val nombreProyecto = readLine() ?: ""
                usuario.crearProyecto(nombreProyecto)
            }
            2 -> {
                print("Introduce el nombre del proyecto: ")
                val nombreProyecto = readLine() ?: ""
                print("Introduce el nombre de la tarea: ")
                val nombreTarea = readLine() ?: ""
                val tarea = Tarea(nombreTarea)
                usuario.añadirTareaProyecto(nombreProyecto, tarea)
            }
            3 -> {
                print("Introduce el nombre del proyecto: ")
                val nombreProyecto = readLine() ?: ""
                print("Introduce el nombre de la tarea a completar: ")
                val nombreTarea = readLine() ?: ""
                usuario.marcarTarea(nombreProyecto, nombreTarea)
            }
            0 -> println("Saliendo...")
            else -> println("Elige una opción válida")
        }
    } while (opcion != 0)
}