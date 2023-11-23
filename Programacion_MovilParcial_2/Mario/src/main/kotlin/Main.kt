import Clases.Goomba
import Clases.Koopa
import Clases.Mario

fun main(){
    // Crear una instancia de la clase Mario
    var mario = Mario()
    // Llamar a la función collision de Mario con el argumento "Fire flower"
    mario.collision("Fire flower")
    // Crear una instancia de la clase Goomba
    val enemy = Goomba()
    enemy.collision("Enemy")   //Colisiona el enemigo con otro enemigo y cambia de direccion
    enemy.collision("Weapon")  //Colisiona el enemigo con una arma

    /*Se crea instancia de clase Koopa*/
    val koopa = Koopa()
    koopa.collision("Weapon") //Koopa colisinoa con un arma y se encierra en su caparazon
}
