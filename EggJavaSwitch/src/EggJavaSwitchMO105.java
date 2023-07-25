import java.util.Scanner;

public class EggJavaSwitchMO105 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 para Guardar.");
        System.out.println("2 para Cargar.");
        System.out.println("3 para Salir.");

        int numIngresado = num1.nextInt();

        switch (numIngresado)   {
            case 1:
                System.out.print("Ha elegido guardar.");
                break;
            case 2:
                System.out.print("Ha elegido cargar.");
                break;
            case 3:
                System.out.print("Ha elegido salir.");
                break;
            default:
                System.out.print("Ingrese un número entre 1 y 3.");
        }

    }
}