package br.edu.ifsp.dmo1.conversortemperaturav2.model

object FahrenheitToCelsiusStrategy : ConversorTemperatura {

    override fun converter(temperature: Double): Double {
        return (temperature - 32) / 1.8
    }

    override fun getScale(): String {
        return "ºC"
    }
}