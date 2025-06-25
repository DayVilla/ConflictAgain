import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    val correctPassword = "password123"
    val correctEmail = "admin@example.com"

    val megaBranch = "megaBranch"

    var attempts = 0
    while (attempts < 3) {
        print("Enter password: ")
        val password = scanner.nextLine()
        print("Enter email: ")
        val email = scanner.nextLine()

        if (password == correctPassword &&
            email == correctEmail) {
            val randomNumber = Random.nextInt(100)
            val randomChar = ('A'..'Z').random()
            println("Login successful! Your session ID: $randomChar$randomNumber")
            return
        } else {
            println("Invalid credentials. Try again.")
        }
        attempts++
    }
    println("Too many failed attempts.")
}
