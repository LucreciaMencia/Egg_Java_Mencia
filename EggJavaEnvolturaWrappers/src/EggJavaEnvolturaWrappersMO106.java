/*Cuenta dígitos en un número: Pide al usuario que ingrese un número.
Convierte el número a una cadena y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO106 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int entero = lector.nextInt();
        String enteroString = String.valueOf(entero);
        int contador = 0;
        for (int i = 0; i<enteroString.length();i++) {
            char c = enteroString.charAt(i);
            if (Character.isDigit(c)) {
                contador++;
            }
        }
        System.out.println("La cantidad de decimales: "+contador);
    }
}
