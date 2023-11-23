package clases
/*Se declara una clase abierta para que otras classes puedan herdar de la clase National*/
open class National(override val city:String): Travel(){
    /*Al heredar de la clase Travel, se reemplaza el valor de la variable country y city mediante
    * la palabra reservada override.
    * Se sobreescriben estas variables para utilizar los valores propios de esta implementación*/
    override val country = "Mexico"
    /*La variable fees (tarifa) es de tipo protected,para que nose pueda acceder a este atributo de clase
    * desde cualquier calse, sino solo desde la misma clase a la que pertenece, y de sublcases de la clase National
    * En esta variable se crea un mapa de las ciudades y el precio al que se vende un boleto a dicho destino*/
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las casas" to 240,
        "San Miguel de Allende" to 320
    )

    /*Se sobreescribe la función getPrice() heredada de la clase Travel para indicar cómo deberá de
    * calcularse el precio del boleto*/
    override fun getPrice(numDays: Int):Int{
        val fee= fees[city]
        return if(fee==null)0 else fee*numDays
    }

    /*Se sobreescribe el método quotePrice heredado de la clase Travel para modficar el comportaniento de la función
    * que da el mensaje del precio del boleto*/
    override fun quotePrice(numDays: Int){
        val price = getPrice(numDays)
        if (price==0){
            println("Lo sentimos no hacemos viajes a esta ciudad")
        }else{
            println("Tu viaje a $city cuesta \$$price")
        }
    }
}