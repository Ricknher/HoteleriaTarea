class HotelRoom(
    val number: Int,
    private val type: String,
    private val capacity: Int,
    private val nightlyPrice: Double,
    var occupied: Boolean = false
) {
    fun displayInformation() {
        println("El numero de su habitacion es: $number")
        println("Tipo de habitacion: $type")
        println("Capacidad: $capacity personas")
        println("Precio por noche: $nightlyPrice")
        println("Estado: ${if (occupied) "Ocupado" else "Disponible"}")
    }
}
