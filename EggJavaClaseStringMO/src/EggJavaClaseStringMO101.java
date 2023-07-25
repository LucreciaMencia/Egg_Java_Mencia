import java.util.Scanner;

public class EggJavaClaseStringMO101 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("Cantidad de letras de una palabra");
    System.out.println("Escriba una palabra: ");
    String palabra = lector.next();
    System.out.println("La palabra tiene "+palabra.length()+" letras.");

    }
}
