package com.luthfihariz.koindemo.data.repo

import com.luthfihariz.koindemo.data.local.DbHelper
import com.luthfihariz.koindemo.data.remote.ApiService

class EventRepositoryImpl(private val dbHelper: DbHelper,
                          private val apiService: ApiService) : EventRepository {
    override fun getEvents(): List<String> {
        return arrayListOf("Android Developer Day",
                "Kotlin Developer Day",
                "Node Js Developer Day")
    }
}