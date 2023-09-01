/*Desarrollar un programa en Java que genere una contraseña aleatoria.

Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos.

La contraseña deberá ser almacenada en un arreglo de Character.

Para la generación de la contraseña, utilice un bucle for que repita la operación tantas veces

como la longitud de la contraseña que haya especificado el usuario.

Para comprobar que la contraseña generada contiene al menos una letra mayúscula, una letra minúscula y un dígito,

utilice bucles do-while y while con los métodos isUpperCase, isLowerCase y isDigit de la clase Character.

Finalmente, convierta el arreglo de caracteres en un String con un for  y luego imprima la contraseña generada en la consola.*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class EggJavaDesafio301 {
    public static void main(String[] args) {
      //  Scanner lector = new Scanner(System.in);

        System.out.println(Math.floor((Math.random()*200)+1));


     /*   System.out.println("CONTRASEÑA ALEATORIA");
        System.out.println("Ingrese longitud de contraseña, debe ser mayor a 6");
        int longitud = lector.nextInt();
        char[] arregloCHar = new char[longitud-1];

        for(int i = 0; i<longitud;i++){
            
        }*/
    }
}
