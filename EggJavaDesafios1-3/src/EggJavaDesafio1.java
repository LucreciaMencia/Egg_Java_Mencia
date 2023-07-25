import java.util.Scanner;

public class EggJavaDesafio1 {
    public static void main(String[] args){
    Scanner num1 = new Scanner(System.in);

    System.out.print("Ingresar un número: ");
    int numeroIngresado = num1.nextInt();

    System.out.println(numeroIngresado%2 == 0 ? "El número "+numeroIngresado+" es par" : "El número "+numeroIngresado+" es impar");

    }
}
