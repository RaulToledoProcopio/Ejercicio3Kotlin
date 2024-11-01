package org.example.Ejercicio4

class Profesor() {
    private val estudiantes = mutableListOf<Estudiante>() // Lista de estudiantes

    // Metodo para agregar un estudiante

    fun agregarEstudiante() {
        print("Ingresa el nombre del estudiante: ")
        val nombreEstudiante = readLine() ?: ""
        val estudiante = Estudiante(nombreEstudiante)
        estudiantes.add(estudiante)
        println("'$nombreEstudiante' agregado.")
    }

    // Metodo para asignar un curso a un estudiante

    fun agregarCurso() {
        print("Ingresa el nombre del estudiante: ")
        val nombreEstudiante = readLine() ?: ""
        val estudiante = estudiantes.find { it.nombre == nombreEstudiante }
        if (estudiante != null) {
            print("Ingresa el nombre del curso: ")
            val nombreCurso = readLine() ?: ""
            estudiante.cursosAsignados.add(nombreCurso)
            println("'$nombreCurso' asignado a ${estudiante.nombre}.")
        } else {
            println("Estudiante no encontrado.")
        }
    }

    // Metodo para agregar una calificación a un estudiante

    fun agregarCalificacion() {
        print("Ingresa el nombre del estudiante: ")
        val nombreEstudiante = readLine() ?: ""
        val estudiante = estudiantes.find { it.nombre == nombreEstudiante }
        if (estudiante != null) {
            print("Ingresa la calificación: ")
            val calificacion = readLine()?.toDoubleOrNull()
            if (calificacion != null) {
                estudiante.calificaciones.add(calificacion)
                println("Calificación $calificacion agregada a ${estudiante.nombre}.")
            } else {
                println("Calificación no válida.")
            }
        } else {
            println("Estudiante no encontrado.")
        }
    }

    // Metodo para calcular el promedio de un estudiante

    fun calcularNotaMedia() {
        print("Ingresa el nombre del estudiante: ")
        val nombreEstudiante = readLine() ?: ""
        val estudiante = estudiantes.find { it.nombre == nombreEstudiante }
        if (estudiante != null) {
            val promedio = if (estudiante.calificaciones.isEmpty()) {
                println("${estudiante.nombre} no tiene calificaciones.")
                0.0
            } else {
                estudiante.calificaciones.average()
            }
            println("${estudiante.nombre} - Nota media: $promedio")
        } else {
            println("Estudiante no encontrado.")
        }
    }
}