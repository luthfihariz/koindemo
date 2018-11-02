package com.luthfihariz.koindemo.presentation.event

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luthfihariz.koindemo.R
import kotlinx.android.synthetic.main.item_event.view.*

class EventAdapter : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    var events : List<String> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): EventViewHolder {
        return EventViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_event, parent, false))
    }

    override fun getItemCount(): Int = events.size

    override fun onBindViewHolder(p0: EventViewHolder, p1: Int) {
        p0.bind(events[p1])
    }

    inner class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(eventName: String) {
            itemView.tvEvent.text = eventName
        }
    }
}