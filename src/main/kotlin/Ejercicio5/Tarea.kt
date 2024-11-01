package org.example.Ejercicio5

class Tarea(val nombre: String) {
    var completada: Boolean = false // Estado de la tarea (completada o no)

    // Metodo para marcar la tarea como completada

    fun completar() {
        completada = true
        println("La tarea '$nombre' ha sido marcada como completada.")
    }

    override fun toString(): String {
        return "$nombre - ${if (completada) "Completada" else "Pendiente"}"
    }
}