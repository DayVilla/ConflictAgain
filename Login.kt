import java.util.Scanner

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

    if (username == correctUsername &&
        password == correctPassword &&
        email == correctEmail) {
        println("Login successful!")
    } else {
        println("Invalid credentials.")
    }
}
