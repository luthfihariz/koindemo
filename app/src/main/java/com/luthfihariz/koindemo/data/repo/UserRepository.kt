package com.luthfihariz.koindemo.data.repo

interface UserRepository {

    fun getUserName(): String

    fun getBaseUrl(): String
}