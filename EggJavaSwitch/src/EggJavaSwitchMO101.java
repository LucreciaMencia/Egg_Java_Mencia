import java.util.Scanner;

public class EggJavaSwitchMO101 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    System.out.print("Escriba un número entre el 1 y el 7: ");
    int diaDeLaSemana = num1.nextInt();

    switch (diaDeLaSemana)  {
        case 1:
            System.out.println(diaDeLaSemana+" es el día lunes.");
            break;
        case 2:
            System.out.println(diaDeLaSemana+" es el día martes.");
            break;
        case 3:
            System.out.println(diaDeLaSemana+" es el día miércoles.");
            break;
        case 4:
            System.out.println(diaDeLaSemana+" es el día jueves.");
            break;
        case 5:
            System.out.println(diaDeLaSemana+" es el día viernes.");
            break;
        case 6:
            System.out.println(diaDeLaSemana+" es el día sábado.");
            break;
        case 7:
            System.out.println(diaDeLaSemana+" es el día domingo.");
            break;
        default:
            System.out.println("Ingresar un número entre el 1 y el 7");
            break;
    }
    }
}
