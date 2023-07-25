import java.util.Scanner;

public class EggJavaSwitchMO104 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Veamos si el día de la semana es un día hábil. Escriba un número entre el 1 y el 7: ");
        int diaDeLaSemana = num1.nextInt();

        switch (diaDeLaSemana)  {
            case 1:
                System.out.println(diaDeLaSemana+" es el día lunes y es día hábil.");
                break;
            case 2:
                System.out.println(diaDeLaSemana+" es el día martes y es día hábil.");
                break;
            case 3:
                System.out.println(diaDeLaSemana+" es el día miércoles y es día hábil.");
                break;
            case 4:
                System.out.println(diaDeLaSemana+" es el día jueves y es día hábil.");
                break;
            case 5:
                System.out.println(diaDeLaSemana+" es el día viernes y es día hábil.");
                break;
            case 6:
                System.out.println(diaDeLaSemana+" es el día sábado y es día no hábil.");
                break;
            case 7:
                System.out.println(diaDeLaSemana+" es el día domingo y es día no hábil.");
                break;
            default:
                System.out.println("Ingresar un número entre el 1 y el 7");
                break;
        }
    }
}
