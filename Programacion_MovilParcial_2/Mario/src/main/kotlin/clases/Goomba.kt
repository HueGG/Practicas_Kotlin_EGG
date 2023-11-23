package Clases
/*Clase Goomba herda de clase abierta Enemy, ya que Goomba también es un enemigo*/
class Goomba: Enemy("Goomba", 1){

    /*Bloque de inicialización que se eejcuta apenas se llame a la clase Goomba*/
    init {
        println("Iniciando subclase de $name")
    }
}