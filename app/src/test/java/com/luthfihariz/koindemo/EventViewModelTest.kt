package com.luthfihariz.koindemo

import com.luthfihariz.koindemo.data.repo.EventRepository
import com.luthfihariz.koindemo.presentation.event.EventViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext
import org.koin.standalone.inject
import org.koin.test.KoinTest
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class EventViewModelTest : KoinTest {

    private val viewModel by inject<EventViewModel>()

    @Mock
    private lateinit var eventRepository: EventRepository

    @Before
    fun before() {
        MockitoAnnotations.initMocks(this)
        StandAloneContext.startKoin(listOf(
                module {
                    single { EventViewModel(eventRepository) }
                }
        ))
    }


    @Test
    fun testGetEvents() {
        Mockito.`when`(eventRepository.getEvents())
                .thenReturn(arrayListOf("Android Developer Day", "Kotlin Developer Day"))

        val events = viewModel.getEvents()

        Mockito.verify(eventRepository).getEvents()
        Assert.assertEquals(events, arrayListOf("Android Developer Day", "Kotlin Developer Day"))
    }
}