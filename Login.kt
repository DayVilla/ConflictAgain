import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter username: ")
    val username = scanner.nextLine()
    print("Enter password: ")
    val password = scanner.nextLine()
    print("Enter email: ")
    val email = scanner.nextLine()
    print("Enter phone number: ")
    val phone = scanner.nextLine()

    val correctUsername = "admin"
    val correctPassword = "password123"
    val correctEmail = "admin@example.com"
    val correctPhone = "1234567890"

    if (username == correctUsername &&
        password == correctPassword &&
        email == correctEmail &&
        phone == correctPhone) {
        println("Login successful!")
    } else {
        println("Invalid credentials.")
    }
}
