/*1. Generación de números aleatorios: Basándonos en el ejercicio que ya has realizado,
crea un método "numeroAleatorio()"
 que no requiera parámetros y devuelva un "int" dentro del rango especificado.*/


import java.util.Scanner;

public class GeneracionDeNumerosAleatorios {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el rango de numeros para trabajar");
        int inicioDeRango = obtenerInicioDeRango();
        int finalDeRango = obtenerFinalDeRango();
        int numeroAleatorio = generadorDeNumerosAleatorios(inicioDeRango, finalDeRango);
        System.out.println("Numero aleatorio: "+numeroAleatorio);
    }
    public static int obtenerInicioDeRango(){
        System.out.println("El inicio: ");

        return  lector.nextInt();
    }
    public static int obtenerFinalDeRango(){
        System.out.println("El final: ");

        return lector.nextInt();
    }
    public static int generadorDeNumerosAleatorios(int min,int max){
        return min + (int) Math.floor(Math.random()*(max-min));
    }
}
