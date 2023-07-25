/*Invertir un array: Escribir un programa que recorra un array de enteros y lo invierta
(es decir, el primer elemento pasa a ser el último y viceversa) y lo imprima por consola.*/
import java.util.Arrays;
public class EggJavaBucleForMO105 {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6};
        System.out.println("INVERTIR ARRAY");
        System.out.println("El array contiene los siguientes valores:"+Arrays.toString(vector));
        for (int i = 0;i< vector.length/2;i++){
            int j = vector.length-i-1;
            int a = vector[i];
            vector[i] = vector[j];
            vector[j] = a;
        }
        System.out.println("El array invertido contiene los siguientes valores:"+Arrays.toString(vector));

    }
}
