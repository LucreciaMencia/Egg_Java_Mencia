/*Promedio de elementos: Escribir un programa que cree un array de 3 enteros e imprima por consola
 el promedio de todos sus elementos, sin usar el bucle for.
 */

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaArraysMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Carga de Array y promedio de sus valores.");
        System.out.println("El Array tendrá 3 valores.");

        double[] vector = new double[3];
        System.out.println("Ingrese el primer valor: ");
        vector[0] = lector.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        vector[1] = lector.nextDouble();
        System.out.println("Ingrese el tercer valor: ");
        vector[2] = lector.nextDouble();
        System.out.println("El array contiene los siguientes números: "+Arrays.toString(vector));

        double promedio = (Arrays.stream(vector).sum())/3;
        System.out.println("El promedio es: "+promedio);
    }
}