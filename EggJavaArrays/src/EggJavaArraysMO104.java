/*Buscar un elemento: Escribir un programa que cree un array de 3 enteros y solicite un número al usuario,
e imprima por consola si está presente en el array o no, sin usar el bucle for.
 */

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaArraysMO104 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] vector = {8,6,2,7,5,4};
        System.out.println("BUSCAR EL ELEMENTO");
        System.out.println("El Array posee "+vector.length+" elementos numéricos.");
        System.out.println("Ecriba un número y veamos si está en el Array.");
        int numero = lector.nextInt();
        int indexVector = Arrays.binarySearch(vector, numero);

        if (indexVector < 0){
            System.out.println("Ese número no está en el array.");
        } else {
            System.out.println("Ese número está en la posición "+indexVector);
        }
    }
}
