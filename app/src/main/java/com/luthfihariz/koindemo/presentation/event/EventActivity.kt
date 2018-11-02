package com.luthfihariz.koindemo.presentation.event

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.luthfihariz.koindemo.R
import kotlinx.android.synthetic.main.activity_event.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class EventActivity : AppCompatActivity() {

    private val adapter by inject<EventAdapter>()

    private val viewModel by viewModel<EventViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        rvEvents.layoutManager = LinearLayoutManager(this)
        adapter.events = viewModel.getEvents()
        rvEvents.adapter = adapter
    }
}