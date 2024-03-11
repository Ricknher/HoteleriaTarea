import java.util.*

class Reservation(
    private val client: ClientHotel,
    private val room: HotelRoom,
    private val checkInDate: Date,
    private val checkOutDate: Date
) {
    fun displayInformation() {
        println("Reservacion para ${client.name}:")
        println("Numero de habitacion: ${room.number}")
        println("Fecha de entrada: $checkInDate")
        println("Fecha de salida: $checkOutDate")
    }
}