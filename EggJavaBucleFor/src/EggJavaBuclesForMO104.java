/*Imprimir elementos en orden inverso:
Escribir un programa que recorra un array de enteros y los imprima en orden inverso,
comenzando desde el último elemento.*/

import java.util.Arrays;
import java.util.Vector;

public class EggJavaBuclesForMO104 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6};
        System.out.println("IMPRIMIR ELEMENTOS EN ORDEN INVERSO.");
        System.out.println("El array tiene los siguientes valores: "+Arrays.toString(vector));
        System.out.println("Sus valores en orden inverso son:");
        for (int i = (vector.length-1); i >= 0 ; i--){
             System.out.println(vector[i]);
        }
    }
}
