/*Ejercicio de cálculo de raíz cuadrada: Escribir un programa que solicite al usuario
 un número positivo y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math.
        Si el número ingresado es negativo, mostrar un mensaje adecuado en pantalla. */

import java.util.Scanner;
public class EggJavaClaseMathMO105 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cálculo de raíz cuadrada");
        System.out.println("Ingrese un número entero no negativo");
        int numeroBase = lector.nextInt();
        System.out.println("La raíz cuadrada de "+numeroBase+" es: "+Math.sqrt(numeroBase));
    }
}
