/*Ejercicio de generación de números aleatorios: Escribir un programa que
genere y muestre en pantalla un número aleatorio en el rango del 1 al 100 utilizando el método random()
 de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
 */

public class EggJavaClaseMathMO103 {
    public static void main(String[] args) {
    System.out.println("Números aleatorios en el rango del 1 al 100.");
    System.out.println(Math.floor((Math.random()*100)+1));
    }
}
