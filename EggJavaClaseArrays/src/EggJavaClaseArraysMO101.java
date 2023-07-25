/*Ordenar en forma descendente: Escribir un programa que ordene un arreglo de enteros
en forma descendente utilizando el método Arrays.sort().
Y los imprima ordenados en la consola.
 */

import java.util.Arrays;
import java.util.Comparator;
public class EggJavaClaseArraysMO101 {
    public static void main(String[] args) {
        Integer[] vector = {5,7,2,6,4,3,8,1};
        System.out.println(Arrays.toString(vector));
        Arrays.sort(vector, Comparator.reverseOrder());
        System.out.println(Arrays.toString(vector));
    }
}
