/*Calcular suma acumulada: Escribir un programa que recorra un array de enteros y calcule la suma acumulada de los elementos,
reemplazando cada elemento por la suma acumulada hasta ese punto. */

import java.util.Arrays;

public class EggJavaBucleForMO102 {
    public static void main(String[] args) {
        int[] vector1 = {8,4,5,3,2,1};
        int[] sumaAcumulada = new int[vector1.length];
        System.out.println("CALCULO DE SUMA ACUMULADA");
        System.out.println("Array de enteros: "+ Arrays.toString(vector1));
        int acumulador = 0;

        for (int i = 0; i < vector1.length; i++ ){
            acumulador = (acumulador+vector1[i]);
            sumaAcumulada[i] = acumulador;
        }
        System.out.println("El array con la suma acumulada es: "+Arrays.toString(sumaAcumulada));
    }
}
