package dev.protrack.uitestapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val authService: AuthService) : ViewModel() {

    var name = mutableStateOf("No User")

    fun load() {
        name.value = authService.fetchUser()
    }
}