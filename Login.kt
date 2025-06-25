import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter username: ")
    val username = scanner.nextLine()
    print("Enter password: ")
    val password = scanner.nextLine()

    val correctUsername = "admin"
    val correctPassword = "password123"

    if (username == correctUsername && password == correctPassword) {
        println("Login successful!")
    } else {
        println("Invalid credentials.")
    }
}
