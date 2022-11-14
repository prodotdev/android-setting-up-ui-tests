package dev.protrack.uitestapp

class FakeAuthService: AuthService {
    override fun fetchUser(): String {
        return "Fake User"
    }
}