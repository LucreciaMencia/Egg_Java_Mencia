/*Número de dígitos: Escribe un programa que le pida al usuario un número entero
y utilice un bucle while para calcular el número de dígitos de ese número.
Por ejemplo, el número 4578 tiene 4 dígitos
(pensar en la lógica para el 0 que debe devolver que tiene una cifra y también para que se cuenten las cifras de números negativos). */

import java.util.Scanner;
public class EggJavaBucleWhileDoWhileMO104 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("NÚMERO DE DÍGITOS");
        System.out.println("Opciones de signo");
        System.out.println("1 - Números positivos");
        System.out.println("2 - Números negativos");
        System.out.println("3 - Ninguno");
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            System.out.println("Elija una opción disponible");
            opcion = lector.nextInt();
        }
        System.out.println(opcion == 1?"Ha elegido positivo":"Ha elegido negativo");
            if(opcion == 3){
                System.out.println("Ha elegido: ningún signo");
            }
        System.out.println("Ingrese el número sin el signo: ");
        int num = lector.nextInt();
        int cifras = 0;
        while (num>0){
            num=num/10;
            cifras++;
        }
        if (num == 0){
            System.out.println("El cero tiene una cifra.");
        } else{
            System.out.println("El número tiene "+cifras+" cifras.");

        }
    }
}
