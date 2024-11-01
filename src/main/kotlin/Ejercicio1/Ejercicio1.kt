package org.example.Ejercicio1


fun Ejercicio1() {

    val biblioteca = Biblioteca() // Creamos una instancia de la clase biblioteca para llamar a los métodos.
    var opcion: Int? = null // Inicialización de la variable que almacenará la opción del menú.

    while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.

        println("Elige una opción:")
        println("1. Agregar libro")
        println("2. Registrar Usuario")
        println("3. Prestar libro")
        println("4. Devolver libro")
        println("5. Mostrar lista completa de libros")
        println("0. Salir")

        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> biblioteca.agregarLibro() // Agregar un libro
            2 -> biblioteca.registrarUsuario() // Registrar un usuario
            3 -> biblioteca.prestarLibro() // Prestar un libro
            4 -> biblioteca.devolverLibro() // Devolver un libro
            5 -> biblioteca.mostrarLibros() // Mostrar libros
            0 -> {
                println("Saliendo...")
                return
            }
            else -> println("Elige una opción válida")
        }
    }
}