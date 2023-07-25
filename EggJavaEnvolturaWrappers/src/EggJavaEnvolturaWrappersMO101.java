/*Suma de números:
Pide al usuario que ingrese un string que represente un entero, y luego un string que represente un doble.
Convierte cada cadena al tipo de dato correspondiente usando los métodos valueOf, suma sus valores e imprímelos por consola.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO101 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("SUMA DE NÚMEROS");
        System.out.println("Escriba un número");
        String num1 = lector.nextLine();
        System.out.println("Escriba un número decimal");
        String num2 = lector.nextLine();

            int entero = Integer.valueOf(num1);
            double decimal = Double.valueOf(num2);
        System.out.println("La suma es "+(entero+decimal));
    }
}
