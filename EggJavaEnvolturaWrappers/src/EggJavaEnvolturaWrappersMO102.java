/*Conversión de cadena a número: Escribir un programa que
lea un dato tipo cadena pero que represente un número entero como entrada utilizando la clase Scanner,
y luego convierta la cadena en un número entero utilizando la clase de envoltura Integer.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("CONVERSIÓN DE CADENA A NÚMERO");
        System.out.println("Ingrese un número entero");
        String enteroString = lector.nextLine();
        int entero = Integer.valueOf(enteroString);
    }
}
