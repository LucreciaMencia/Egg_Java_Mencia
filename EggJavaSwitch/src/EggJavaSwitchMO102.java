import java.util.Scanner;
public class EggJavaSwitchMO102 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Escriba un número del 1 al 5: ");
        int numIngresado = num1.nextInt();

        switch (numIngresado)   {
            case 1:
                System.out.println(numIngresado+" Muy deficiente.");
                break;
            case 2:
                System.out.println(numIngresado+" Deficiente.");
                break;
            case 3:
                System.out.println(numIngresado+" Suficiente.");
                break;
            case 4:
                System.out.println(numIngresado+" Notable.");
                break;
            case 5:
                System.out.println(numIngresado+" Sobresaliente.");
                break;
            default:
                System.out.println("Ingrese número entre 1 y 5.");
                break;
        }
    }
}
