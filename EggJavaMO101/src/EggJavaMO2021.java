import java.awt.*;
import java.util.Scanner;
public class EggJavaMO2021 {
public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    Scanner num2 = new Scanner(System.in);

    System.out.print("Ingrese el primer número :");
    int numIngresado1 = num1.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int numIngresado2 = num2.nextInt();

    System.out.print("La suma de los números es: "+(numIngresado1 + numIngresado2));
}
}
