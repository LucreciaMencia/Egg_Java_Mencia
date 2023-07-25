/*Copiar parte de un arreglo:
OK 1 - Crear un programa en Java que declare y muestre un arreglo de enteros junto con sus indices.
OK 2 - Luego, el programa debe solicitar al usuario dos índices: un índice inicial y un índice final.
OK 3 - Con estos dos índices, el programa debe copiar la parte del arreglo original comprendida entre estos dos índices (inclusive)
en un nuevo arreglo utilizando el método Arrays.copyOfRange().
OK 4 - Asegúrese de incluir validaciones para confirmar que el índice inicial es menor que el índice final
y que ambos índices estén dentro del rango válido del arreglo original.
OK 5 - Finalmente, el programa debe imprimir el nuevo arreglo por consola.*/

import java.util.Arrays;
import java.util.Scanner;
public class EggJavaClaseArraysMO104 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("COPIAR PARTE DE UN ARREGLO");
        int[] arreglo = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("El índice "+i+" tiene el valor "+arreglo[i]);
        }

        System.out.println("Debe elegir desde qué índice hasta cuál inclusive quiere copiar.");
        int indiceInicial = -1;
        while (indiceInicial < 0 || indiceInicial > arreglo.length-2) {
            System.out.println("Elija el índice inicial, puede ir desde el cero hasta el anteúltimo.");
            indiceInicial = lector.nextInt();
        }

        int indiceFinal = 0;
        while (indiceInicial < 1 || indiceFinal > arreglo.length-1 || indiceFinal < indiceInicial){
            System.out.println("Elija el índice final, puede ir desde el uno hasta el último.");
            indiceFinal = lector.nextInt();
        }

        int[] copiaArreglo = Arrays.copyOfRange(arreglo,indiceInicial,indiceFinal+1);
        System.out.println("Nuevo array copia: "+Arrays.toString(copiaArreglo));

    }
}
