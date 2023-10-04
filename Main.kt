fun main() {
    val input: Any = "Eduardo"
    tipoDato(input)
}

fun tipoDato(input: Any) {
    when (input) {
        is Int -> println("El dato ingresado es un número entero.")
        is Double -> println("El dato ingresado es un número decimal.")
        is String -> println("El dato ingresado es una cadena de texto.")
        is Boolean -> println("El dato ingresado es un valor booleano.")
        else -> println("Tipo de dato desconocido")
    }
}
