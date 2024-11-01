package org.example.Ejercicio5

class Proyecto(val nombre: String) {

    // Lista para guardar las tareas
    private val tareas = mutableListOf<Tarea>()

    // Metodo para añadir una tarea al proyecto

    fun añadirTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("'${tarea.nombre}' añadida a '$nombre'.")
    }

    // Metodo para buscar una tarea por nombre

    fun buscarTarea(nombreTarea: String): Tarea? {
        return tareas.find { it.nombre.equals(nombreTarea, ignoreCase = true) }
    }
}