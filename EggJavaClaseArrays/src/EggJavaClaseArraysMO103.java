/*Comparar arreglos: Escribir un programa que compare dos arreglos de enteros utilizando el método Arrays.equals().
El programa debe imprimir si los arreglos son iguales o no.*/

import java.util.Arrays;
public class EggJavaClaseArraysMO103 {
    public static void main(String[] args) {
        String[] vectorUno = {"uno","dos"};
        String[] vectorDos = {"tres","dos"};
        System.out.println("COMPARAR ARREGLOS");
        System.out.println(Arrays.toString(vectorDos));
        System.out.println(Arrays.toString(vectorUno));

        boolean igualdadUnoYDos = vectorUno.equals(vectorDos);
        System.out.println("Los arreglos son iguales: "+igualdadUnoYDos);


    }
}
