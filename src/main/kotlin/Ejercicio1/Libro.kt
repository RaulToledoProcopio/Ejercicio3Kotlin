package org.example.Ejercicio1

data class Libro(val titulo: String, val autor: String, var prestado: Boolean = false, var prestadoA: Usuario? = null)

