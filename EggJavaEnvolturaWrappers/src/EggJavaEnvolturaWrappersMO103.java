/*Verificar si una cadena contiene solo letras:
Pide al usuario que ingrese una cadena.
Crea un bucle que recorra cada carácter en la cadena y use Character.isLetter() para verificar si todos los caracteres son letras.
Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO103 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("VERIFICAR SI UNA CADENA CONTIENE SOLO LETRAS");
        System.out.println("Ingrese una cadena");
        char letra = 'a';
        String cadena = lector.nextLine();
        for (int i = 0; i < cadena.length();i++){
            letra = cadena.charAt(i);
            if (!Character.isLetter(letra)){
            break;
            }
        }
        if (!Character.isLetter(letra)) {
            System.out.println("La cadena tiene al menos un número.");
        } else {
            System.out.println("La cadena tiene solo letras.");
        }
        }
}
