/*Búsqueda binaria: Escribir un programa que realice una búsqueda binaria en un arreglo ordenado de enteros
utilizando el método Arrays.binarySearch().
El programa debe imprimir el índice del valor buscado si está presente en el arreglo.*/

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaClaseArraysMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] vector = {5,1,2,7,8,9,3,6};
        System.out.println("BÚSQUEDA BINARIA");
        System.out.println("Ingrese un número entre 1 y 10 para comprobar si está en el vector.");
        Arrays.sort(vector);
        int numIngresado = lector.nextInt();
        int indice = Arrays.binarySearch(vector, numIngresado);
        System.out.println(indice);
        if (indice >= 0) {
            System.out.println("El valor " + numIngresado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El valor " + numIngresado + " no se encontró en el arreglo.");
        }
    }
}
