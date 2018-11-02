package com.luthfihariz.koindemo.data.remote

class ApiService(private val baseUrl: String) {
    fun getBaseUrl(): String = baseUrl
}