import java.util.Scanner;
public class EggJavaIfElseIfMO102 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    System.out.println("Escriba un número entero: ");
    int numIngresado = num1.nextInt();

        if (numIngresado == 0) {
            System.out.println("El número es cero.");
        } else if (numIngresado > 0) {
            System.out.println("El número es positivo.");
        } else if (numIngresado < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("Ingrese un número entero.");
        }
    }
}
