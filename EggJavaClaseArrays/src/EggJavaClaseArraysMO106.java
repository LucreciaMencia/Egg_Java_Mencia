/*Rellenar un arreglo de manera personalizada: Escribir un programa en Java que solicite al usuario un tamaño para un arreglo.
OK Luego, debe pedirle que ingrese un número con el cual desea rellenar cierta parte del arreglo, seguido de un índice final.
Esta parte del arreglo deberá ser rellenada con el número proporcionado hasta el indice ingresado por el usuario.
Si el índice final ingresado no es el último índice del arreglo, el programa debe continuar pidiendo
al usuario nuevos números para rellenar el arreglo, hasta que se haya proporcionado un número para cada posición.

Asegúrese de validar lo siguiente:
La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
El índice final siempre debe ser menor que el tamaño total del arreglo.
Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice inicial debe ser el índice inmediatamente siguiente al último índice final
ingresado.
El usuario solo deberá ingresar el nuevo índice final.
Por último el programa debe imprimir por consola el arreglo completo.
 */

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaClaseArraysMO106 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("RELLENAR UN ARREGLO DE MANERA PERSONALIZADA");
        System.out.println("Escriba el tamaño del arreglo.");
        int size = lector.nextInt();
        System.out.println("Ingrese número para rellenar cierta parte.");
        int rellenoParcial = lector.nextInt();

        int indiceFinalParcial = -1;
        while (indiceFinalParcial < 0 || indiceFinalParcial > size-1) {
            System.out.println("Escriba el indice final hasta donde llega el relleno parcial del arreglo.");
            indiceFinalParcial = lector.nextInt();
        }
        int[] arreglo = new int[size];
        Arrays.fill(arreglo, 0, indiceFinalParcial+1, rellenoParcial);

        System.out.println(Arrays.toString(arreglo));

        int indiceCero = Arrays.binarySearch(arreglo, 0);
        int nuevoIndiceFinal = indiceFinalParcial+1;
        int nuevoRelleno = 0;
        do {
            System.out.println("Escriba el nuevo índice final.");
            nuevoIndiceFinal = lector.nextInt();
        } while (nuevoIndiceFinal < indiceFinalParcial);

        do{
            System.out.println("Escriba un nuevo relleno");
            nuevoRelleno = lector.nextInt();
            Arrays.fill(arreglo,indiceFinalParcial+1,nuevoIndiceFinal+1,nuevoRelleno);
            indiceFinalParcial = nuevoIndiceFinal;
            indiceCero = Arrays.binarySearch(arreglo, 0);
        } while (nuevoIndiceFinal  < arreglo.length-1);


        System.out.println(Arrays.toString(arreglo));
        System.out.println("El arreglo ya está completo.");
    }
}
