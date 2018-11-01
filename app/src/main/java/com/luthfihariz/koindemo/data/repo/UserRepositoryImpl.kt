package com.luthfihariz.koindemo.data.repo

import com.luthfihariz.koindemo.data.local.DbHelper

class UserRepositoryImpl(private val dbHelper: DbHelper) : UserRepository {

    override fun getUserName(): String {
        return dbHelper.getUserName()
    }
}