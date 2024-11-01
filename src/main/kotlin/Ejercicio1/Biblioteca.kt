package org.example.Ejercicio1

class Biblioteca {

    //Listas para guardar los libros y los usuarios que vayamos agregando

    private val libros: MutableList<Libro> = mutableListOf()
    private val usuarios: MutableList<Usuario> = mutableListOf()

    // Metodo para agregar un libro solicitando al usuario el título y autor

    fun agregarLibro() {

        println("Introduce el título del libro:")
        val titulo = readLine() ?: return // Captura el título del libro
        println("Introduce el autor del libro:")
        val autor = readLine() ?: return // Captura el autor del libro

        val libro = Libro(titulo, autor)
        libros.add(libro)
        println("Libro agregado: ${libro.titulo} por ${libro.autor}")

    }

    // Metodo para registrar un usuario solicitando el nombre

    fun registrarUsuario() {

        println("Introduce el nombre del usuario:")
        val nombre = readLine() ?: return // Captura el nombre del usuario
        val usuario = Usuario(nombre)
        usuarios.add(usuario)
        println("Usuario registrado: ${usuario.nombre}")

    }

    // Metodo para prestar un libro a un usuario

    fun prestarLibro() {

        println("Introduce el título del libro:")
        val titulo = readLine() ?: return // Captura el título del libro
        println("Introduce el nombre del usuario:")
        val nombreUsuario = readLine() ?: return // Captura el nombre del usuario

        val libro = libros.find { it.titulo.equals(titulo, ignoreCase = true) }
        val usuario = usuarios.find { it.nombre.equals(nombreUsuario, ignoreCase = true) }

        if (libro == null) {
            println("El libro '$titulo' no está disponible")
            return

        }

        if (usuario == null) {

            println("No se encontró ningún usuario con el nombre '$nombreUsuario'.")
            return

        }

        if (libro.prestado) {

            println("El libro '$titulo' ya está prestado a ${libro.prestadoA?.nombre}.")
        } else {

            libro.prestado = true
            libro.prestadoA = usuario
            println("El libro '$titulo' ha sido prestado a ${usuario.nombre}.")

        }
    }

    // Metodo para devolver un libro

    fun devolverLibro() {

        println("Introduce el título del libro que quieres devolver:")
        val titulo = readLine() ?: return // Captura el título del libro

        val libro = libros.find { it.titulo.equals(titulo, ignoreCase = true) }

        if (libro == null) {
            println("El libro '$titulo' no está en la biblioteca.")
            return

        }

        if (!libro.prestado) {

            println("El libro '$titulo' no está prestado.")
        } else {

            libro.prestado = false
            println("El libro '$titulo' ha sido devuelto a la biblioteca.")
            libro.prestadoA = null // Limpiar la referencia del usuario que tenía el libro

        }
    }

    // Metodo para mostrar todos los libros en la biblioteca

    fun mostrarLibros() {

        if (libros.isEmpty()) {
            println("No hay libros en la biblioteca.")
        } else {
            println("Libros en la biblioteca:")
            for (libro in libros) {
                val estado = if (libro.prestado) "Prestado a ${libro.prestadoA?.nombre}" else "Disponible"
                println("- ${libro.titulo} por ${libro.autor} [$estado]")

            }
        }
    }
}