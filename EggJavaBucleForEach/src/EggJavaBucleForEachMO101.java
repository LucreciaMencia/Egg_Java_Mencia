/*Contar elementos pares: Escribir un programa que recorra un array de enteros
e imprima por consola sus elementos.
 */

import java.util.Arrays;
public class EggJavaBucleForEachMO101 {
    public static void main(String[] args) {
    int[] vector = {1,2,5,4,7,8,6};
    int sumaPares = 0;
    System.out.println("COMPARTIR ELEMENTOS PARES");
    for (int numeros : vector) {
        if (numeros%2 == 0){
            sumaPares = sumaPares + 1;
        }
    }
        System.out.println("En el siguiente array: "+Arrays.toString(vector)+" hay "+sumaPares+" valores pares.");
    }
}