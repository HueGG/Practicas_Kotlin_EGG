package Clases
import kotlin.concurrent.schedule
import java.util.*
/*Creacion e clase Mario*/
class Mario(var vidas: Int = 3) {   //Inicializar el numero de vidas por defecto
    init {
        println("It's a me! Mario!")
    }

    /*Atributos de clase privados que solo se pueden ser accedidos por la clase a la que pertenecen*/
    private var state = "small"
        set(value){
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if(value=="Star"){
                Timer("SettingUp", false).schedule(10000){
                    field = before
                    println("tu estado ahora es $field")
                }
            }
        }
    /*Atributo privado que inicializa el numero de vidas*/
    private var lives = 3
        set(value){
            // Verifica si las vidas son 1 o 0 y realiza acciones en consecuencia
            if(field == 1){
                field = 0
                gameOver() // Llama a la función gameOver si las vidas son 1
            }
            else if (field == 0){
                println("Necesitas volver a jugar") // Mensaje si las vidas son 0 o esta muerto
            }
            else{
                field = value // Actualiza las vidas
            }
        }

    // Propiedad de solo lectura que indica si Mario está vivo
    val isAlive: Boolean
        get(){
            return lives >=1 //
        }

    fun collision(collisionObj: String){
        when (collisionObj){
            "Goomba" -> lives-- // Pierde una vida si choca con un Goomba
            "Super Mushroom" -> state = "Super Mario" // Se convierte en Super Mario al recoger un Super Mushroom
            "Fire flower" -> state = "Fire Mario" // Se convierte en Fire Mario al recoger un Fire Flower
            "Star" -> state = "Star" // Se convierte en Star Mario al recoger una Star

            else -> println("Objeto desconocido, ¡No pasa nada!") // Mensaje para objetos desconocidos
        }
    }
    // Función que devuelve el número de vidas como una cadena
    fun getLives(): String{
        return "$lives vidas"
    }
    // Función privada que se llama cuando el juego termina
    private fun gameOver(){
        println("Juego Terminado") // Mensaje cuando el juego termina
        }
}

