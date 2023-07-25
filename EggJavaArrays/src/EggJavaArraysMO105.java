/*Copiar elementos: Escribir un programa que cree un array de 3 enteros y cree una copia del mismo pero
con un tamaño extra de 2 elementos, imprimiendo el contenido del nuevo array por consola, sin usar el bucle for.
 */

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaArraysMO105 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("COPIAR ELEMENTOS");
        System.out.println("El Array tendrá 3 valores.");
        int[] vector = new int[3];
        System.out.println("Ingrese el primer valor: ");
        vector[0] = lector.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        vector[1] = lector.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        vector[2] = lector.nextInt();
        System.out.println("El array contiene los siguientes números: "+Arrays.toString(vector));
        int[] vectorCopia = Arrays.copyOf(vector, 5);
        System.out.println("Se ha copiado el array y se han agregado 2 indices más");
        System.out.println("El array contiene los siguientes números: "+Arrays.toString(vectorCopia));

    }
}
