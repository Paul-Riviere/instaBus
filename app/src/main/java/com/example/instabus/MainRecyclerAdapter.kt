package com.example.instabus

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instabus.data.BusStop

class MainRecyclerAdapter(val context: Context,
                          val stops: List<BusStop>):
    RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>()

{
    override fun getItemCount() = stops.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.bus_stop_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val busStop = stops[position]
        with(holder) {
            nameText?.let {
                it.text = busStop.street_name
            }
        }
    }

    inner class ViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView) {
        val nameText = itemView.findViewById<TextView>(R.id.nameText)
    }
}