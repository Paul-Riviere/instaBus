package com.example.instabus

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.instabus.data.BusStop
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class MainViewModel(app: Application): AndroidViewModel(app) {
    private val listType = Types.newParameterizedType(
        List::class.java, BusStop::class.java
    )
    val stopData

    init {
//        récup API
//        val text
//        parseText(text)
    }

    fun parseText(text: String) {
        val moshi = Moshi.Builder().build()
        val adapter: JsonAdapter<List<BusStop>> =
            moshi.adapter(listType)
        stopData = adapter.fromJson(text)
    }
}