package dev.protrack.uitestapp

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

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
    fun provideAuthService(): HttpAuthService {
        return HttpAuthService()
    }
}