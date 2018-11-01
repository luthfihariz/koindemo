package com.luthfihariz.koindemo.presentation.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.luthfihariz.koindemo.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvUserName.text = mainViewModel.getUserName()

    }
}
