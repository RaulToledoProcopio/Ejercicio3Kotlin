package org.example.Ejercicio2

// Gestión del hotel

class Hotel {

    //Listas para guardas las habitaciones y las reservas

    private val habitaciones: MutableList<Habitacion> = mutableListOf()
    private val reservas: MutableList<Reserva> = mutableListOf()

    init {

        //Creamos 5 habitaciones de prueba

        habitaciones.add(Habitacion(1))
        habitaciones.add(Habitacion(2))
        habitaciones.add(Habitacion(3))
        habitaciones.add(Habitacion(4))
        habitaciones.add(Habitacion(5))
    }

    // Metodo para mostrar todas las habitaciones disponibles

    fun mostrarHabitaciones() {
        println("Habitaciones disponibles:")
        for (habitacion in habitaciones) {
            val estado = if (habitacion.ocupada) "Ocupada" else "Disponible"
            println("Habitación ${habitacion.numero} - Estado: $estado")
        }
    }

    // Metodo para reservar una habitación

    fun reservarHabitacion() {
        mostrarHabitaciones()
        println("Introduce el número de la habitación:")
        val numeroHabitacion = readLine()?.toIntOrNull() ?: return

        val habitacion = habitaciones.find { it.numero == numeroHabitacion }

        if (habitacion == null) {
            println("No se encuentra la habitación")
            return
        }

        if (habitacion.ocupada) {
            println("La habitación ${habitacion.numero} ya está ocupada.")
            return
        }

        println("Introduce tu nombre:")
        val nombreCliente = readLine() ?: return

        val cliente = Cliente(nombreCliente)
        val reserva = Reserva(cliente, habitacion)

        habitacion.ocupada = true // Marcar la habitación como ocupada
        reservas.add(reserva) // Agregar la reserva a la lista
        println("La habitación ${habitacion.numero} ha sido reservada a nombre de:  ${cliente.nombre}.")
    }

    // Metodo para cancelar una reserva

    fun cancelarReserva() {
        println("Introduce el número de la habitación para cancelar la reserva:")
        val numeroHabitacion = readLine()?.toIntOrNull() ?: return

        val reserva = reservas.find { it.habitacion.numero == numeroHabitacion }

        if (reserva == null) {
            println("La habitación $numeroHabitacion no está reservada.")
            return
        }

        reservas.remove(reserva) // Eliminar la reserva de la lista
        reserva.habitacion.ocupada = false // Marcar la habitación como disponible
        println("La reserva de la habitación ${reserva.habitacion.numero} ha sido cancelada.")
    }

    // Metodo para mostrar todas las reservas activas

    fun mostrarReservas() {
        if (reservas.isEmpty()) {
            println("No hay reservas.")
        } else {
            println("Reservas actuales:")
            for (reserva in reservas) {
                println("Cliente: ${reserva.cliente.nombre}, Habitación: ${reserva.habitacion.numero}")
            }
        }
    }
}