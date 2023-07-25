import java.util.InputMismatchException;
import java.util.Scanner;
public class EggJavaTryCatchMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Escriba un número: ");
            String numString = lector.next();
            numero = Integer.parseInt(numString);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("ESCRIBA NÚMEROS");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("SUCEDIÓ UN ERROR.");
        }
    }
}