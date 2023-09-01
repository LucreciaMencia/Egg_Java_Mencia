/*2. Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()"
para que no necesiten recibir el Scanner por parámetro.
 En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.*/

import java.util.Scanner;

public class UsarUnaVariableGlobal {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimirNombreYEdad(nombre, edad);
    }
    public static void imprimirNombreYEdad(String argNombre, int argEdad){
        System.out.println("Su nombre es "+argNombre+" y su edad es "+argEdad);
    }
    public static String obtenerNombre(){
        System.out.println("Escriba su nombre ");
        return lector.nextLine();
    }
    public static int obtenerEdad(){
        System.out.println("Escriba su edad ");
        return lector.nextInt();
    }
}
