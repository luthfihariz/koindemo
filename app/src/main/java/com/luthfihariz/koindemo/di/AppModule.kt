package com.luthfihariz.koindemo.di

import com.luthfihariz.koindemo.data.local.DbHelper
import com.luthfihariz.koindemo.data.repo.UserRepository
import com.luthfihariz.koindemo.data.repo.UserRepositoryImpl
import com.luthfihariz.koindemo.presentation.main.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {
    single { DbHelper() }
    single { UserRepositoryImpl(get()) as UserRepository }
    viewModel { MainViewModel(get()) }
}