package com.luthfihariz.koindemo.data.repo

import com.luthfihariz.koindemo.data.local.DbHelper
import com.luthfihariz.koindemo.data.remote.ApiService

class UserRepositoryImpl(private val dbHelper: DbHelper, private val apiService: ApiService) : UserRepository {

    override fun getUserName(): String {
        return dbHelper.getUserName()
    }

    override fun getBaseUrl(): String {
        return apiService.getBaseUrl()
    }
}