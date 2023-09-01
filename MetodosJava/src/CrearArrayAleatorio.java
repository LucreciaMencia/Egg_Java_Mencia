/*2. Crear array aleatorio: Basándote en el ejercicio del punto 7 ("Adivinar el número"),
crea un programa que te permita generar un array de tipo "int" de manera aleatoria.

El programa debe solicitar al usuario
el tamaño del array
y el rango de números posibles para rellenarlo.*/

import java.util.Scanner;
import java.util.Arrays;

public class CrearArrayAleatorio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el largo del array");
        int largoDelArray = lector.nextInt();
        System.out.println("Ingrese el min del rango para los numeros aleatorios");
        int minRango = lector.nextInt();
        System.out.println("Ingrese el max del rango para los numeros aleatorios");
        int maxRango = lector.nextInt();

        int[] arrayAleatorio = new int[largoDelArray];


    }
    public static int crearNumerosAleatorios(int min, int max){

    }
}
