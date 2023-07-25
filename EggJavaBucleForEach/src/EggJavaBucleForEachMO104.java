/*Concatenar elementos: Concatenar todos los elementos de un array de cadenas
en una sola cadena separada por espacios e imprimirlo en consola. */

import java.util.Arrays;
public class EggJavaBucleForEachMO104 {
    public static void main(String[] args) {
        String concatenado = "";
        String[] vector = {"Hola ","como ","estas ","?"};
        for (String palabras : vector){
            concatenado = concatenado.concat(palabras);
        }
        System.out.println(concatenado);
    }
}
