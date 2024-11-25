package br.edu.ifsp.dmo1.conversortemperaturav2.model

import android.health.connect.datatypes.units.Temperature

interface ConversorTemperatura {

    fun converter(temperature: Double) : Double

    fun getScale(): String
}