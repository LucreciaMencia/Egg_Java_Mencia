/*Encontrar el valor mínimo: Escribir un programa que recorra un array de enteros
y encuentre el valor mínimo presente en el array.
 */
import java.util.Arrays;
public class EggJavaBuclesForMO103 {
    public static void main(String[] args) {
        int[] vector = {987,951,963,915,972,934};
        int comparador = 1000;
        int valorMinimo = 0;
        System.out.println("Los valores del Array son "+Arrays.toString(vector));
        for (int i = 0; i < vector.length; i++){
            if (vector[i]<comparador) {
                comparador = vector[i];
            }
        }
        valorMinimo = comparador;
        System.out.println("El valor mínimo es "+valorMinimo);
    }
}
