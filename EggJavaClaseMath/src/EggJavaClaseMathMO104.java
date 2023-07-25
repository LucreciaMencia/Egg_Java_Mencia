/*Ejercicio de cálculo de potencia: Escribir un programa que solicite al usuario dos números enteros,
 representando la base y el exponente, y calcular el resultado de elevar la base al exponente utilizando el método pow() de la clase Math.
 Mostrar el resultado en pantalla.
 */
import java.util.Scanner;
public class EggJavaClaseMathMO104 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cálculo de potencia");
        System.out.println("Ingrese un número entero para la base: ");
        int numeroBase = lector.nextInt();
        System.out.println("Ingrese un número entero que será la potencia: ");
        int exponente = lector.nextInt();

        System.out.println("El resultado es: "+Math.pow(numeroBase,exponente));
    }
}
