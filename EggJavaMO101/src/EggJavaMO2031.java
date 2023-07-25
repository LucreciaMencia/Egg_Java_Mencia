import java.util.Scanner;

public class EggJavaMO2031 {
    public static void main (String[] args){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numIngresado1 = num1.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numIngresado2 = num2.nextInt();

        boolean primeroMayorAlSegundo = (numIngresado1 > numIngresado2);
        boolean primeroDistintoAlSegundo = (numIngresado1 != numIngresado2);
        boolean primeroDivisiblePorElSegundo = ((numIngresado1%numIngresado2) == 0);

        System.out.println("Que el primer número es mayor al segundo es: "+primeroMayorAlSegundo);
        System.out.println("Que el primero sea distinto al segundo es: "+primeroDistintoAlSegundo);
        System.out.println("Que el primero sea divisible por elsegundo es: "+primeroDivisiblePorElSegundo);

    }
}
