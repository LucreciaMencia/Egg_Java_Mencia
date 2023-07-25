/* Ejercicio de redondeo de números: Escribir un programa que solicite al usuario un número decimal
y muestre en pantalla su valor redondeado utilizando el método round() de la clase Math.
 */

import java.util.Scanner;
public class EggJavaClaseMathMO102 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("Redondeo de números");
    System.out.println("Escriba un número decimal, separando con punto.");
    double numero = lector.nextDouble();
    System.out.println("El número redondeado es "+Math.round(numero));
    }
}
