package dev.protrack.uitestapp

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen() {
    val userViewModel: UserViewModel = viewModel()

    LaunchedEffect(key1 = true) {
        userViewModel.load()
    }

    Text(text = userViewModel.name.value)
}