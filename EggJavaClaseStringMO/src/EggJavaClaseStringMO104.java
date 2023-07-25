        /*Ejercicio de búsqueda de caracteres: Escribir un programa que solicite al usuario una palabra y un carácter,
        y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String.
        Mostrar un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.*/
//indexOf() devuelve -1 si no encuentra el caracter en la cadena
import java.util.Scanner;
public class EggJavaClaseStringMO104 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Búsqueda de caracteres");
    System.out.println("Escrina una palabra: ");
        String palabra = lector.next();
    System.out.println("Ingrese una letra: ");
        String letra = lector.next();

    System.out.println(
       (palabra.indexOf(letra) != -1)?   //condicion
               "El caracter se encuentra en el indice "+palabra.indexOf(letra)+" de la palabra.": //si es verdadero
               "La palabra no tiene esa letra."); //si es falso
    }
}
