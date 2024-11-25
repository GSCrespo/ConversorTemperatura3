package br.edu.ifsp.dmo1.conversortemperaturav2.model

object FahrenheitToKelvinStrategy : ConversorTemperatura {

    override fun converter(temperature: Double): Double {
        return ( ( (temperature - 32) * 5 ) / 9) + 273.15
    }

    override fun getScale(): String {
        return "K"
    }
}