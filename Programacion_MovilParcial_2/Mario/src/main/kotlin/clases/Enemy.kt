package Clases
/*Clase que puede ser heredadapor otra clase gracias a la palabra reservada open*/
open class Enemy (val name: String, val strength:Int){
    /*Bloque de inicialización de la presente clase*/
    init {
        println("Iniciando superclase") /*Se imprime este mensjae desde el principio en quese llam a esta clase*/
    }
    /*Atributod protected para que solo se acceda a ellos mediante la misma clase a la que pertenecen o desde clases que heredan de esta*/
    protected var direction: String = "Left"
    protected fun changeDirection(){
        /*Cambio de dirección del enemigo en el juego*/
        direction = if (direction=="Right") "Left" else "Right"
        println("$name va en dirección $direction")
    }
    protected fun die(){
        /*Imprime un mensaje de que el jugador ha perdidio o muerto*/
        println("$name ha muerto")
    }
    /*Fnución abierta que puede sobreescribirse en la implementación de una subcase de Enemy*/
    open fun collision(collider: String){
        /*Recibe un tipo de dato cadena que indica contra que colisiona Mario*/
        when (collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}