import java.util.*

class ClientHotelController {
    private val scanner = Scanner(System.`in`)

    fun registerClient(): ClientHotel {
        println("Ingrese la informacion del cliente:")
        print("Nombre: ")
        val name = scanner.nextLine()
        print("Numero de habitacion: ")
        val roomNumber = scanner.nextInt()
        print("Duracion de la estancia (en dias): ")
        val stayDuration = scanner.nextInt()
        scanner.nextLine()
        print("Numero de telefono: ")
        val phoneNumber = scanner.nextLine()
        print("Email: ")
        val email = scanner.nextLine()
        return ClientHotel(name, roomNumber, stayDuration, phoneNumber, email)
    }
}