class Estudiante(val curso: String, val calificacionPromedio: Double, nombre: String, edad: Int, id: String): Persona(nombre, edad,
    id
) {

    override fun mostrarRol() {
        println("Nombre: $nombre, Rol: Estudiante, edad: $calificacionPromedio")
    }
    fun mostrarCalificacion(){
        calificacionPromedio
    }


}