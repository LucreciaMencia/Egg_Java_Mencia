/*Imprimir elementos: Escribir un programa que recorra un array de enteros e
imprima cada elemento en una línea separada.
 */

import java.util.Arrays;
public class EggJavaBucleForMO101 {
    public static void main(String[] args) {
        int[] vectorDeEnteros = {8,5,4,2,6};
        for (int i = 0; i < vectorDeEnteros.length; i++){
            System.out.println("El elemento "+(i+1)+" es: "+vectorDeEnteros[i]);
        }
    }

}
