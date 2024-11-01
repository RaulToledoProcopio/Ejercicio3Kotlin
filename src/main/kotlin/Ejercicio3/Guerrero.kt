package org.example.Ejercicio3

class Guerrero(val nombre: String, var puntosVida: Int) {
    fun atacar(): Int {
        val damage = 10 // Daño fijo para guerreros
        println("$nombre ataca con su espada y causa $damage de daño.")
        return damage
    }
}