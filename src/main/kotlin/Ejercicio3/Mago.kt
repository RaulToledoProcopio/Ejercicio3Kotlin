package org.example.Ejercicio3

class Mago(val nombre: String, var puntosVida: Int) {
    private val hechizoNombre = "Bola de fuego" // Nombre del único hechizo
    private val damage = 15 // Daño fijo del hechizo

    fun usarHechizo(): String {
        println("$nombre lanza $hechizoNombre y causa $damage de daño.")
        return hechizoNombre
    }
}