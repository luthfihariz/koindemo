package com.luthfihariz.koindemo.presentation.event

import android.arch.lifecycle.ViewModel
import com.luthfihariz.koindemo.data.repo.EventRepository

class EventViewModel(private val eventRepository: EventRepository) : ViewModel() {
    fun getEvents(): List<String> = eventRepository.getEvents()
}