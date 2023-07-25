/*Cuenta espacios en blanco en una cadena:
Pide al usuario que ingrese una cadena.
Crea un bucle que recorra cada carácter en la cadena y use Character.isWhitespace() para contar el número de espacios en blanco en la cadena.
Muestra el recuento al usuario.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO104 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("CUENTA ESPACIOS EN BLANCO EN LA CADENA");
        System.out.println("Ingrese una cadena");
        String cadena = lector.nextLine();
        char c = 'a';
        int contador = 0;
        for (int i = 0;i<cadena.length();i++ ){
            c = cadena.charAt(i);
            if (Character.isWhitespace(c)){
                contador++;
            }
        }
        if (contador>0){
            System.out.println("Hay "+contador+" espacios.");
        } else {
            System.out.println("No hay espacios.");
        }
    }
}
