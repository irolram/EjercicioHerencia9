class Profesor(val departamento : String, val aniosExperiencia: Double, nombre: String, edad: Int, id: String): Persona(nombre, edad,
    id
) {

    override fun mostrarRol() {
        println("Nombre: $nombre, Rol: Profesor, Años de experiencia: $aniosExperiencia")
    }
    fun mostrarExperiencia(){
        aniosExperiencia
    }
}