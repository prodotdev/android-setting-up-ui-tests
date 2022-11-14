package dev.protrack.uitestapp

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import io.mockk.mockk
import javax.inject.Singleton

val mockAuthService = mockk<AuthService>(relaxed = true)

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [
        AuthModules::class
    ]
)
object TestModules {
    @Provides
    @Singleton
    fun provideAuthService(): AuthService {
        return mockAuthService
    }
}

