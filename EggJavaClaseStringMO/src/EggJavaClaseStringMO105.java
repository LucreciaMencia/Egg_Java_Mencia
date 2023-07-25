/*Ejercicio de conversión de mayúsculas y minúsculas: Escribir un programa que solicite al usuario una cadena de texto
        y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas.
        Utilizar los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.*/

import java.util.Scanner;
public class EggJavaClaseStringMO105 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Conversión de mayúsculas y minúsculas");
        System.out.println("Ingrese una cadena de texto: ");
        String cadena = lector.nextLine();
        System.out.println("1- Para convertir a mayúsculas.");
        System.out.println("2- Para convertir a minúsculas.");
        int opcionElegida = lector.nextInt();

        System.out.println((opcionElegida == 1)?cadena.toUpperCase():cadena.toLowerCase());

    }
}
