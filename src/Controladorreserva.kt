import java.text.SimpleDateFormat
import java.util.*

class ReservationController {
    private val scanner = Scanner(System.`in`)
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    fun createReservation(client: ClientHotel, room: HotelRoom): Reservation {
        println("Ingrese la informacion de la reservacion para ${client.name}:")
        print("Ingrese la fecha de entrada (yyyy-MM-dd): ")
        val checkInDateStr = scanner.next()
        val checkInDate = dateFormat.parse(checkInDateStr)
        print("Ingrese la fecha de salida (yyyy-MM-dd): ")
        val checkOutDateStr = scanner.next()
        val checkOutDate = dateFormat.parse(checkOutDateStr)
        room.occupied = true
        return Reservation(client, room, checkInDate, checkOutDate)
    }
}

fun main() {
    val clientController = ClientHotelController()
    val roomController = HotelRoomController()
    val reservationController = ReservationController()
    val client = clientController.registerClient()
    val room = roomController.createRoom()
    val reservation = reservationController.createReservation(client, room)

    client.displayInformation()
    room.displayInformation()
    reservation.displayInformation()
}