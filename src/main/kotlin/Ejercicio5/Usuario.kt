package org.example.Ejercicio5

class Usuario() {

    // Lista para guardar los proyectos

    private val proyectos = mutableListOf<Proyecto>()

    // Metodo para crear un proyecto

    fun crearProyecto(nombreProyecto: String) {
        val proyecto = Proyecto(nombreProyecto)
        proyectos.add(proyecto)
        println("'$nombreProyecto' creado.")
    }

    // Metodo para añadir tareas a un proyecto existente

    fun añadirTareaProyecto(nombreProyecto: String, tarea: Tarea) {
        val proyecto = proyectos.find { it.nombre.equals(nombreProyecto, ignoreCase = true) }
        if (proyecto != null) {
            proyecto.añadirTarea(tarea)
        } else {
            println("'$nombreProyecto' no encontrado.")
        }
    }

    // Metodo para marcar una tarea como completada

    fun marcarTarea(nombreProyecto: String, nombreTarea: String) {
        val proyecto = proyectos.find { it.nombre.equals(nombreProyecto, ignoreCase = true) }
        if (proyecto != null) {
            val tarea = proyecto.buscarTarea(nombreTarea)
            tarea?.completar() ?: println("'$nombreTarea' no encontrada en'$nombreProyecto'.")
        } else {
            println("'$nombreProyecto' no encontrado.")
        }
    }
}
