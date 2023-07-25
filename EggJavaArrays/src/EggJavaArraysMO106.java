/*Ordenar elementos: Escribir un programa que solicite al usuario 4 nombres,
lo cuales debes ordenar alfabeticamente y luego imprimirlos en consola, sin usar el bucle for.
*/
import java.util.Arrays;
import java.util.Scanner;
public class EggJavaArraysMO106 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] vector = new String[4];
        System.out.println("ORDENAR ELEMENTOS");
        System.out.println("Debe ingresar cuatro nombres");
        System.out.println("nombre 1");
        vector[0] = lector.next();
        System.out.println("nombre 2");
        vector[1] = lector.next();
        System.out.println("nombre 3");
        vector[2] = lector.next();
        System.out.println("nombre 4");
        vector[3] = lector.next();
        Arrays.sort(vector);
        System.out.println("Los nombre ordenados en orden alfabetico son:");
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);

    }
}
