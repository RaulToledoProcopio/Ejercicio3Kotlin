package org.example.Ejercicio3

class SitemaJuego {

    // Lista para almacenar personajes
    private val personajes = mutableListOf<Any>()

    // Metodo para crear un Guerrero

    fun crearGuerrero() {

        println("Introduce el nombre del Guerrero:")
        val nombre = readLine() ?: return
        personajes.add(Guerrero(nombre, 100))
        println("$nombre creado.")
    }

    // Metodo para crear un Mago

    fun crearMago() {
        println("Introduce el nombre del Mago:")
        val nombre = readLine() ?: return
        personajes.add(Mago(nombre, 100)) // Mago con 80 puntos de vida
        println("$nombre creado.")
    }

    // Metodo para mostrar los personajes

    fun mostrarPersonajes() {
        if (personajes.isEmpty()) {
            println("No hay personajes creados.")
            return
        }

        println("Personajes creados:")
        for (personaje in personajes) {
            when (personaje) {
                is Guerrero -> println("${personaje.nombre} - Guerrero")
                is Mago -> println("${personaje.nombre} - Mago")
            }
        }
    }

    // Metodo para realizar una acción

    fun realizarAccion() {

        println("Selecciona un personaje:")
        mostrarPersonajes()

        println("Introduce el nombre del personaje que quieres usar:")
        val nombre = readLine() ?: return

        // Buscamos el personaje en la lista

        val personaje = personajes.find {
            when (it) {
                is Guerrero -> it.nombre == nombre
                is Mago -> it.nombre == nombre
                else -> false
            }
        }

        if (personaje == null) {
            println("Personaje no encontrado.")
            return
        }

        when (personaje) {
            is Guerrero -> personaje.atacar()
            is Mago -> personaje.usarHechizo()
        }
    }
}
