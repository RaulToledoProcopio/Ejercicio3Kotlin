package org.example.Ejercicio4

class Estudiante(val nombre: String) {

    // Listas para guardar los cursos y las calificaciones
    val calificaciones = mutableListOf<Double>()
    val cursosAsignados = mutableListOf<String>()
}