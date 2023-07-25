/*Validación de contraseña: Escribir un programa que solicite al usuario ingresar una contraseña y la valide utilizando un bucle while.
La contraseña correcta es "secreto".
El programa debe seguir pidiendo al usuario que ingrese la contraseña hasta que sea correcta.*/

import java.util.Scanner;

public class EggJavaBucleWhileDoWhileMO103 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("VALIDACIÓN DE CONTRASEÑA");
        System.out.println("Ingrese contraseña:");
        String contraseña = lector.next();
        String validacion = "";

        do {
            System.out.println("Ingrese nuevamente para validar contraseña: ");
            validacion = lector.next();
        } while (!validacion.equals(contraseña));
        System.out.println("LA CONTRASEÑA ES VÁLIDA");
    }
}
