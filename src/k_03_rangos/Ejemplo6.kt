package k_03_rangos

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * En caso que el incremento o decremento de un rango de datos queramos realizarlo
 * en base a N unidades, utilizamos la instrucción STEP N (N es el numero de pasos que queramos pasar o avanzar)
 *
 * */

fun main() {
    for(i in 2..100 step 2) {
        print("$i, ")
    }
}