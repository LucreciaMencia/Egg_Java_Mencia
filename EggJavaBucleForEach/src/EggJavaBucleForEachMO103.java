/*Calcular promedio: Sumar todos los elementos de un array de números reales
y calcular su promedio e imprimirlo en consola.*/

import java.util.Arrays;
public class EggJavaBucleForEachMO103 {
    public static void main(String[] args) {
        System.out.println("CALCULAR PROMEDIO");
        float[] elementosParaSumar = {5,6,8,2,4,7,6};
        float suma = 0;
        for (float numeros : elementosParaSumar){
        suma = suma + numeros;
        }
        float promedio = suma/elementosParaSumar.length;
        System.out.println("El promedio de "+Arrays.toString(elementosParaSumar)+" es "+promedio);
    }
}
