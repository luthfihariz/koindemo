package com.luthfihariz.koindemo.presentation.main

import android.arch.lifecycle.ViewModel
import com.luthfihariz.koindemo.data.repo.UserRepository

class MainViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getUserName(): String {
        return userRepository.getUserName()
    }

    fun getBaseUrl(): String {
        return userRepository.getBaseUrl()
    }
}