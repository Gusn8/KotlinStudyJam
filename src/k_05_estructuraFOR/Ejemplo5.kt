package k_05_estructuraFOR

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * Ejercicio estructura FOR con cantidad ingresada desde teclado.
 *
 * */

fun main() {
    var cant = 0
    print("Cuantos valores ingresará para analizar: ")
    val cantidad = readLine()!!.toInt()
    for(i in 1..cantidad) {
        print("Ingrese valor $i: ")
        val valor = readLine()!!.toInt()
        if (valor % 2 ==0)
            cant++
    }
    println("Cantidad de pares: $cant")
}