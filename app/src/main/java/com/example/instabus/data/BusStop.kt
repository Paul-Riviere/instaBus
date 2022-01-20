package com.example.instabus.data

import com.squareup.moshi.Json

class BusStop (@Json(name="id") val id: String,
               @Json(name="street_name") val street_name: String,
               @Json(name="city") val city: String,
               @Json(name="utm_x") val utm_x: String,
               @Json(name="utm_y") val utm_y: String,
               @Json(name="lat") val lat: String,
               @Json(name="lon") val lon: String,
               @Json(name="furniture") val furniture: String,
               @Json(name="buses") val buses: String,
               @Json(name="distance") val distance: String)
{
}