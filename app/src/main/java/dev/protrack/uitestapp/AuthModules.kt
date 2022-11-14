package dev.protrack.uitestapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object AuthModules {
    @Provides
    @Singleton
    fun provideAuthService(): AuthService {
        return HttpAuthService()
    }
}