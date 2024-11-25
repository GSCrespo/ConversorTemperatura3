package br.edu.ifsp.dmo1.conversortemperaturav2.model

object KelvinToFahrenheitStrategy : ConversorTemperatura {

    override fun converter(temperature: Double): Double {
        return (((temperature - 271.15) * 9 ) / 5) + 32
    }

    override fun getScale(): String {
        return "ºC"
    }
}