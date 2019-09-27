package k_10_poo.ejemplo1

/**
 * @author Gustavo Lizárraga
 * @date 26/09/2019
 *
 * A diferencia de Java, en Kotlin no es necesario colocar la palabra reservada 'new' para crear
 * una instancia de un objeto, solamente llamar al objeto y enviarle sus atributos como
 * argumentos.
 *
 * */

fun main() {
    val persona1 = Persona()
    persona1.inicializar("Gustavo", 28)
    persona1.imprimir()
    persona1.esMayorDeEdad()

    val persona2 = Persona()
    persona2.inicializar("Valeria", 12)
    persona2.imprimir()
    persona2.esMayorDeEdad()
}