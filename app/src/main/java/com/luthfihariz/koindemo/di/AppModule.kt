package com.luthfihariz.koindemo.di

import com.luthfihariz.koindemo.data.local.DbHelper
import com.luthfihariz.koindemo.data.remote.ApiService
import com.luthfihariz.koindemo.data.repo.EventRepository
import com.luthfihariz.koindemo.data.repo.EventRepositoryImpl
import com.luthfihariz.koindemo.data.repo.UserRepository
import com.luthfihariz.koindemo.data.repo.UserRepositoryImpl
import com.luthfihariz.koindemo.presentation.event.EventAdapter
import com.luthfihariz.koindemo.presentation.event.EventViewModel
import com.luthfihariz.koindemo.presentation.main.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {
    single { DbHelper() }
    single("mock") { ApiService("http://mock.com") }
    single("production") { ApiService("http://production.com") }
    single { UserRepositoryImpl(get(), get("production")) as UserRepository }
    single { EventRepositoryImpl(get(), get("production")) as EventRepository }
    factory { EventAdapter() }
    viewModel { EventViewModel(get()) }
    viewModel { MainViewModel(get()) }
}