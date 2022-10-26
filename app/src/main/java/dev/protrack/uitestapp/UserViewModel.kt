package dev.protrack.uitestapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    val authService = AuthService()

    var name = mutableStateOf("No User")

    fun load() {
        name.value = authService.fetchUser()
    }
}