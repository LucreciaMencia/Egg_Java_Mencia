import java.util.Scanner;

public class EggJavaSwitchMO103 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    System.out.println("Formulas de área.");
    System.out.println("1 para círculo.");
    System.out.println("2 para cuadrado.");
    System.out.println("3 para triángulo.");

    int numIngresado = num1.nextInt();

    switch (numIngresado)   {
        case 1:
            System.out.print("El área del círculo es pi por radio al cuadrado.");
            break;
        case 2:
            System.out.print("El área del cuadrado es igual a lado por lado.");
            break;
        case 3:
            System.out.print("El área de un triángulo es igual a base por altura partido por 2.");
            break;
        default:
            System.out.print("Ingrese un número entre 1 y 3.");

    }



    }
}