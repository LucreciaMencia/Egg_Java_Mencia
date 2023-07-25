/*Suma de elementos: Escribir un programa que cree un array de 3 enteros
 e imprima por consola la suma de todos sus elementos, sin usar el bucle for.*/

import java.util.Arrays;
public class EggJavaArraysMO101 {
    public static void main(String[] args) {
        int[] vector = {5,8,2};
        System.out.println("El array contiene los siguientes números: "+Arrays.toString(vector));
        int suma = Arrays.stream(vector).sum();
        System.out.println("La suma de los número del vector es: "+suma);
    }
}
