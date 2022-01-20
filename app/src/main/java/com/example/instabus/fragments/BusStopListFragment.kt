package com.example.instabus.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.instabus.MainRecyclerAdapter
import com.example.instabus.MainViewModel
import com.example.instabus.R
import java.util.Observer

class BusStopListFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_bus_stop_list, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        viewModel = ViewModelProviders.of( this).get(MainViewModel::class.java)
        viewModel.stopData.observe(this, Observer{
            val adapter = MainRecyclerAdapter(requireContext(), it)
            recyclerView.adapter = adapter
        })
    }
}