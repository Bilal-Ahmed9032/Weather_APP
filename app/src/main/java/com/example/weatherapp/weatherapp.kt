package com.example.weatherapp

data class weatherapp(
    val address: String,
    val alerts: List<Any>,
    val currentConditions: CurrentConditions,
    val days: List<Day>,
    val description: String,
    val latitude: Double,
    val longitude: Double,
    val queryCost: Int,
    val resolvedAddress: String,
    val stations: Stations,
    val timezone: String,
    val tzoffset: Double
)