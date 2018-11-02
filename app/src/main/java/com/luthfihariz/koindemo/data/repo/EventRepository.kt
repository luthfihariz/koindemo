package com.luthfihariz.koindemo.data.repo

interface EventRepository {

    fun getEvents(): List<String>
}