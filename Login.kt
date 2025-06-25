import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter username: ")
    val username = scanner.nextLine()
    print("Enter password: ")
    val password = scanner.nextLine()
    print("Enter email: ")
    val email = scanner.nextLine()

    val correctUsername = "admin"
    val correctPassword = "password123"
    val correctEmail = "admin@example.com"

    val megaBranch = "megaBranch"

    if (username == correctUsername &&
        password == correctPassword &&
        email == correctEmail) {
        val randomNumber = Random.nextInt(100)
        val randomChar = ('A'..'Z').random()
        println("Login successful! Your session ID: $randomChar$randomNumber")
    } else {
        println("Invalid credentials.")
    }
}
