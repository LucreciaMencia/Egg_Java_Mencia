/*1. Obtener datos: Crea dos métodos para obtener el nombre y la edad, respectivamente.
Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner". */
import java.util.Scanner;
public class ObtenerDatosConScanner {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    String nombre = metodo1(lector);
    int edad = metodo2(lector);
    imprimirNombreYEdad(nombre, edad);
    }
    public static void imprimirNombreYEdad(String argNombre,int argEdad){
        System.out.println("Su nombre es "+argNombre+" y su edad es "+argEdad);
    }
    public static String metodo1(Scanner lec){
        System.out.println("Escriba su nombre: ");
        return lec.nextLine();
    }
    public static int metodo2(Scanner lec){
        System.out.println("Escriba su edad: ");
        return lec.nextInt();
    }
}
