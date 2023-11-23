package Clases
/*Clase Koopa que hereda de Enemy*/
class Koopa: Enemy("Koopa", 2){
    /*Sobreescritura de función collision de la super clase Enemy
    * Se modifica el comportamiento de la función collision definido en Enemy*/
    override fun collision(collider: String) {

        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("El estado ahora es $state")
            } /*Si recibe un disparo, se encierra en su concha*/
            "Enemy" -> changeDirection() /*Si choca contra otro enemigo, solo cambia de direccion el enemigo actual*/
        }
        println("Usando la colisión de la clase Enemy")
    }
}