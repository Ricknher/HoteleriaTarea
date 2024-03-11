class ClientHotel(
    val name: String,
    private val roomNumber: Int,
    private val stayDuration: Int,
    private val phoneNumber: String,
    private val email: String
) {
    fun displayInformation() {
        println("Ingrese su nombre: $name")
        println("Ingrese el numero de la habitacion: $roomNumber")
        println("Ingrese la duracion de su estancia: $stayDuration dias")
        println("Ingrese su numero de telefono: $phoneNumber")
        println("Ingrese su Email: $email")
    }
}