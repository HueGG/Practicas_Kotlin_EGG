package clases
/*Creacion de clase abstracta que no puede ser instanciada directamente.
Generalmente se usa como base o molde para otras clases que heredaran de la clase abstracta
Los métodos abstractos de una clase abstracta no tienen una implementación
Los métodos se impplementan a tarves de las clases que herredan de la clase abstracta
*/
abstract class Travel {
    abstract val country:String
    abstract val city:String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    abstract fun quotePrice(numDays: Int)
    protected abstract fun getPrice(numDays: Int):Int
    /*Función que imprime un mensaje dependiendo de si el viaje ya ha sido reservado  o no*/
    fun reserve(numDays:Int){
        if (reserved){
            println("""""Ya reservaste tu viaje!
                    Pais : $country
                    Ciudad: $city
                    Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount==0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente!
            Pais: $country
            Ciudad: $city
            Precio: $paidAmount""".trimMargin())
    }
}