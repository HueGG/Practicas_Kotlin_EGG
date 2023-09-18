const val PI = 3.1416f
fun main(args: Array<String>) {
    //Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo
    val numero_decimal = 15f
    println("El tipo de dato es: ${numero_decimal::class.simpleName}")
    println("Su valor es: $numero_decimal")
    //Volver un valor Double a flotante. Se coloca una f al final del numero
    val valorFlotante = 9.81f
    //Se puede realizar un casting tambien, tal y como se ve en la siguiente linea
    val nuevoFlotante = numero_decimal.toFloat()
    println("El tipo de dato de valorFlotante es: ${valorFlotante::class.simpleName}")
    println("El tipo de dato de nuevoFlotante es: ${nuevoFlotante::class.simpleName}")
    println("Valor de valorFlotante es: $valorFlotante")
    println("Valor de nuevoFlotante es: $nuevoFlotante")
    //Declarar una variable const val con el valor de PI
    //y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    println("El perimetro del circulo es: ${Perimetro(numero_decimal)}")
}
fun Perimetro(numero_decimal:Float): Float {
    return PI * (2 * numero_decimal)
}