package Clases
/*Creacion de clase Vehicle*/
/*Rqueire de tres parametro iniciales que son la marca, moeelo y color del automovil*/
class Vehicle (val marca: String, val modelo: String, var color: String = "Amarillo"){
    /*Bloque de inicialización que se ejecta al llamar a esta clase*/
    init {
        /*Se imprimen inicliamente los datos dle auto como la marca, modelo y color */
        println("""Los datos del coche son:
            marca: $marca
            modelo: $modelo
            color: $color""")
    }

    /*Metodo constructor que requiere de mas parametros como marca, modelo color  y placas*/
    constructor(marca: String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas //Se inicializa las plazas del auto
        println("Las placas son: ${this.placas}") //Se imprimer mensaje de las placas del auto
    }

    //atributos de la clase
    var placas = ""
    var gasolina = 0f
    var encendido = false

    //metodos
    //Encender auto
    fun encender(){
        encendido = true
    }
    //apagar auto
    fun apagar(){
        encendido = false
    }

    // recargar gasolina en auto
    fun recargar(litros:Float){
        gasolina+=litros
    }
}