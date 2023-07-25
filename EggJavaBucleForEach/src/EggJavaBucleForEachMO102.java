/*Contar ocurrencias: Escribir un programa que recorra un array de caracteres y solicite al usuario un carácter objetivo,
y cuente cuántas veces aparece el carácter objetivo en el array y lo imprima por consola.*/

import java.util.Scanner;
import java.util.Arrays;
public class EggJavaBucleForEachMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] vector = {"a","a","a","a","e","e","e","i","i","i","i","i","o","o","u"};
        int sumaOcurrencias = 0;
        System.out.println("CONTAR OCURRENCIAS");
        System.out.println("Ingrese una vocal: ");
        String vocalIngresada = lector.next();
        for (String vocal : vector){
            if (vocalIngresada.equals(vocal)){
                sumaOcurrencias = sumaOcurrencias + 1;
            }
        }
        System.out.println("Valores del array "+Arrays.toString(vector));
        System.out.println("La vocal "+vocalIngresada+" aparece "+sumaOcurrencias+" veces.");
    }
}

