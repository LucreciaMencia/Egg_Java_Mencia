/*Adivinar el número: Escribir un programa que genere un número aleatorio entre 1 y 100,
y le pida al usuario adivinar ese número utilizando un bucle do-while.
El programa debe mostrar un mensaje indicando si el número ingresado es mayor o menor que el número aleatorio,
y continuar pidiendo al usuario que adivine hasta que lo haga correctamente.*/

import java.util.Scanner;
import java.util.ArrayList;

public class EggJavaBucleWhileDoWhileMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ADIVINE EL NÚMERO");
        double numAleatorio = Math.floor((Math.random()*10)+1);
        int adivinar = 0;
        ArrayList<Integer> numerosElegidos = new ArrayList<>();

        while (adivinar != numAleatorio){
            System.out.println("Ingrese un número es menor o igual a 10:");
            adivinar = lector.nextInt();
            if (adivinar < numAleatorio){
                System.out.println("Inténta otra vez! es un número mayor.");
            } else if (adivinar > numAleatorio) {
                System.out.println("Inténte otra vez! es un número menor.");
            }
            numerosElegidos.add(adivinar);
            System.out.println("Ya elegiste: "+numerosElegidos);
        }
        System.out.println("FELICITACIONES, ADIVINASTE!");
    }
}
