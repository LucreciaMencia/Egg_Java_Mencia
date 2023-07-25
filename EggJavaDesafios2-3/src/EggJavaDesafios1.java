/*Escribir un programa que solicite al usuario una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
        Luego, el programa debe convertir la temperatura a la otra unidad de medida y mostrar el resultado en pantalla.
        El programa debe manejar las siguientes situaciones:
       1 Si el usuario ingresa una unidad de medida inválida, mostrar un mensaje de error.
       2 Si el usuario ingresa una temperatura no válida, mostrar un mensaje de error.*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class EggJavaDesafios1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Conversión de unidades de temperaturas");
        String unidad = "a";
        int temperatura = 0;

        try {
            System.out.println("Ingrese la temperatura: ");
            temperatura = lector.nextInt();
            System.out.println("Elija la unidad:");
            System.out.println("C para Celsius.");
            System.out.println("F para Fahrenheit.");
            unidad = (lector.next()).toUpperCase();
            if (unidad.equals("C") || unidad.equals("F")) {
             //   var s = String.format("La tempera es %s en Celsius. %s.", temperatura, segundaVariable); //Lo que está despues de la coma se reemplaza en la s. Siempre es %s¨
                System.out.println((unidad.equals("C"))?temperatura+" grados Celsius equivale a "+((temperatura*9/5)+32)+" grados Fahrenheit.":
                        temperatura+" grados Fahrenheit equivale a "+((temperatura-32)*5/9)+" grados Celsius.");
            } else {
                System.out.println("Por favor elija F o C");
            }
        } catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Ingrese una temperatura válida, en números."+e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Ha habido un error."+e.getMessage());
        }

    }
}
