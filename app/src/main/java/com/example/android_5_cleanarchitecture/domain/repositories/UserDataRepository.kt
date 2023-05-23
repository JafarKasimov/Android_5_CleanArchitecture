package com.example.android_5_cleanarchitecture.domain.repositories

import com.example.android_5_cleanarchitecture.models.UserData


interface UserDataRepository {
    fun authUser(name : String, surname : String, age : Int)

    fun getUser() : UserData
}