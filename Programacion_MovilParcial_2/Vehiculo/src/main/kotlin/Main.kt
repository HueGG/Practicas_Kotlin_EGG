import Clases.Vehicle
/*Clase vehiclo*/
fun main(){
    /*parametro de solo lectura*/
    val miVehiculo = Vehicle("Ford","2020","Verde")
    miVehiculo.placas = "MMX8944"

    println("El coche está encendido? ${miVehiculo.encendido}")
    miVehiculo.encender() //Encender auto

    println("El coche encendio? ${miVehiculo.encendido}") //Mensje de encendido
    println("El tanque tiene ${miVehiculo.gasolina}") //Imprimer nivel de gasolina del auto

    miVehiculo.recargar(18.07f) //Recargar de gasolina con un valor flotante
    println("El tanque ahora tiene ${miVehiculo.gasolina}") //IMprimir nivel de gasolina


    val golNegro = Vehicle("Volkswagen", "Gol")
    // Crear un nuevo auto pasandole todos los argumentos con NamedArguments
    val sonicAzul = Vehicle(
        marca = "Ford",
        modelo = "Fiesta",
        color = "Rojo",
        placas = "AMX7864"
    )
    // Imprimir información sobre los vehículos adicionales
    println(golNegro)
    println(sonicAzul)
}