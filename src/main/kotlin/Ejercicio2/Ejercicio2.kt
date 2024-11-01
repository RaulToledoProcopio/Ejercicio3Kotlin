package org.example.Ejercicio2

fun Ejercicio2() {

    val hotel = Hotel()
    var opcion: Int? = null

    while (opcion != 0) {

        println("Elige una opción:")
        println("1. Mostrar habitaciones")
        println("2. Reservar habitación")
        println("3. Cancelar reserva")
        println("4. Mostrar reservas activas")
        println("0. Salir")

        print("Elige una opción: ")
        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> hotel.mostrarHabitaciones()
            2 -> hotel.reservarHabitacion()
            3 -> hotel.cancelarReserva()
            4 -> hotel.mostrarReservas()
            0 -> println("Saliendo...")
            else -> println("Elige una opción válida")
        }
    }
}