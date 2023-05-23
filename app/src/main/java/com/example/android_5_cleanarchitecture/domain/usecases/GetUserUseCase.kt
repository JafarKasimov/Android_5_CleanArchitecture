package com.example.android_5_cleanarchitecture.domain.usecases

import com.example.android_5_cleanarchitecture.domain.repositories.UserDataRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userDataRepository: UserDataRepository
) {
    operator fun invoke() = userDataRepository.getUser()
}