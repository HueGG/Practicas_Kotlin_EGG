import clases.*

fun main(){
    val viajeMonterrey = National(city = "Monterrey")
    viajeMonterrey.reserve(4)
    val viajeBajaMonterrey = NationalLowSeason(city = "Monterrey")
    viajeBajaMonterrey.reserve(4)

}