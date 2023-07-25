/*Ejercicio de cálculo del valor absoluto: Escribir un programa
        que solicite al usuario un número entero
        y muestre en pantalla su valor absoluto utilizando el método abs() de la clase Math.*/

import java.util.Scanner;
public class EggJavaClaseMathMO101 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cálculo de valor absoluto.");
        System.out.println("Ingrese un número entero, sea positivo o negativo");
        int numero = lector.nextInt();
        System.out.println("El valor absoluto de "+numero+" es "+Math.abs(numero));
    }
}
