package com.example.android_5_cleanarchitecture.di

import com.example.domain.repositories.UserDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideUserRepository(repositoryImpl: UserDataRepository): UserDataRepository
}