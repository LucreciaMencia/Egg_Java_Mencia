/*Rellenar un arreglo: Escribir un programa que
solicite al usuario el tamaño para un arreglo y un entero con el cual quiera rellanarlo, crear el arreglo y usar Arrays.fill().
Luego, imprime el arreglo resultante.*/

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaClaseArraysMO105 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("RELLENAR ARREGLO");
        System.out.println("Se necesita un entero para determinar el tamaño y otro para rellenar mediante Arrays.fill()");
        System.out.println("Escriba el tamaño del arreglo");
        int size = lector.nextInt();
        int[] arreglo = new int[size];
        System.out.println("Escriba el número para rellenar.");
        int relleno = lector.nextInt();
        Arrays.fill(arreglo,relleno);
        System.out.println("Arreglo resultante: "+Arrays.toString(arreglo));
    }
}
