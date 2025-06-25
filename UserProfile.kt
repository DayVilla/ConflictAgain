data class UserProfile(val username: String, val email: String)

fun showUserProfile(profile: UserProfile) {
    println("=== User Profile ===")
    println("Username: ${profile.username}")
    println("Email: ${profile.email}")
}
