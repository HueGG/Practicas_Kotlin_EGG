fun main(){
    //Declaracion de variables
    val x1:Double = 4.0
    val x2:Double = -3.0
    val y1:Double = 3.0
    val y2:Double = -2.0
    val m:Double = calcular_pendiente(x1,x2,y1,y2)
    println("El valor de la pendiente entre P1($x1,$y1), P2($x2,$y2) es: $m")

}
//Función para la pendiente que recibe 4 parametros tipo Double y retorna un Double
fun calcular_pendiente(x1: Double, x2:Double, y1:Double,y2:Double):Double {
    val m:Double = (y2-y1)/(x2-x1)
    return m
}