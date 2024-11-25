package br.edu.ifsp.dmo1.conversortemperaturav2.model

object KelvinToCelsiusStrategy : ConversorTemperatura {

    override fun converter(temperature: Double): Double {
        var  result : Double

        if(temperature > 0){
            result = temperature - 273.15
        }else{
            result = -273.15
        }
        return result
    }

    override fun getScale(): String {
        return "ºC"
    }
}