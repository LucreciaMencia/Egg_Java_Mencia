/*Menú interactivo con while: Crea un menú interactivo que solicite al usuario que elija una opción de un conjunto de opciones.
El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa.
Para este ejercicio, no es necesario que las opciones del menú realicen acciones reales.
Solo necesitas mostrar un mensaje que indique qué opción eligió el usuario.*/

import java.util.Scanner;
public class EggJavaBucleWhileDoWhileMO101 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("MENÚ INTERACTIVO");
        System.out.println("1 - Abrir archivo");
        System.out.println("2 - Guardar archivo");
        System.out.println("3 - Salir");
        int opcion = 0;

         while (opcion != 3){
             System.out.println("Elija una opción:");
             opcion = lector.nextInt();
             System.out.println("Ha elegido la opción "+opcion);
         }
        System.out.println("Ha salido");
    }
}
