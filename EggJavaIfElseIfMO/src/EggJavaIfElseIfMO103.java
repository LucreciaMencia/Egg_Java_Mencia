import java.util.Scanner;

public class EggJavaIfElseIfMO103 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    System.out.println("Comprobemos si tu número es divisible por 5 y 3");
    System.out.print("Ingrese un número entero: ");
    int numIngresado = num1.nextInt();

    int restoDivididoCinco = numIngresado%5;
    int restoDivididoTres = numIngresado%3;

    if  (restoDivididoCinco == 0) {
        System.out.println(numIngresado+" Es divisible por 5.");
    } else if (restoDivididoCinco != 0) {
        System.out.println(numIngresado+" No es divisible por 5.");
    }

    if (restoDivididoTres == 0) {
        System.out.println(numIngresado+" Es divisible por 3.");
    } else if (restoDivididoTres != 0) {
        System.out.println(numIngresado+" No es divisible por 3.");
    }

    if (restoDivididoTres != 0 && restoDivididoCinco != 0){
        System.out.println(numIngresado+" No es divisible por ninguno.");
    }

    if (restoDivididoCinco == 0 && restoDivididoTres == 0){
        System.out.println(numIngresado+" Es divisible por ambos.");
    }
    }
}
