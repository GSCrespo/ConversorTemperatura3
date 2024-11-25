package br.edu.ifsp.dmo1.conversortemperaturav2.model

object CelsiusToKelvinStrategy : ConversorTemperatura {

    override fun converter(temperature: Double): Double {
        return temperature + 273.15
    }

    override fun getScale(): String {
        return "ºK"
    }
}