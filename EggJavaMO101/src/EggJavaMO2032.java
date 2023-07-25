import java.util.Scanner;

public class EggJavaMO2032 {
    public static void main(String[] args){
         Scanner num1 = new Scanner(System.in);
         Scanner num2 = new Scanner(System.in);
         Scanner num3 = new Scanner(System.in);
         Scanner num4 = new Scanner(System.in);

      System.out.println("Ingrese cuatro números.");
        System.out.print("Primero: ");
        int numIngresado1 = num1.nextInt();
        System.out.print("Segundo: ");
        int numIngresado2 = num2.nextInt();
        System.out.print("Tercero: ");
        int numIngresado3 = num3.nextInt();
        System.out.print("Cuarto: ");
        int numIngresado4 = num4.nextInt();

     Boolean primeroMayorSegundoYTerceroMayorCuarto = (numIngresado1>numIngresado2 && numIngresado3>numIngresado4);
     Boolean primeroMayorSeguntoOTerceroMayorCuarto = (numIngresado1>numIngresado2 || numIngresado3>numIngresado4);

     System.out.println("Que el número 1 es mayor al número 2 y que el número 3 es mayor al número 4 es: "+primeroMayorSegundoYTerceroMayorCuarto);
     System.out.println("Que el número 1 es mayor al número 2 o que el número 3 es mayor al número 4 es: "+primeroMayorSeguntoOTerceroMayorCuarto);
    }
}
