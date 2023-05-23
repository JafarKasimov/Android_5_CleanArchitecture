package com.example.android_5_cleanarchitecture.domain.usecases

import com.example.android_5_cleanarchitecture.domain.repositories.UserDataRepository
import javax.inject.Inject

class AuthUserUseCase @Inject constructor(
    private val userDataRepository : UserDataRepository
) {
    operator fun invoke(name : String, surname : String, age : Int){
        userDataRepository.authUser(name, surname, age)
    }
}