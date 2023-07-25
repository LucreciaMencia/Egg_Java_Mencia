import java.util.InputMismatchException;
import java.util.Scanner;

public class EggJavaTryCatchMO101 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cociente = 0;

        System.out.println("División entre números enteros");

        try {
            System.out.print("Inrese el dividendo: ");
            int dividendo = lector.nextInt();
            System.out.print("Ingrese el divisor, distinto de cero: ");
            int divisor = lector.nextInt();

            cociente = dividendo / divisor;
            System.out.println("El resultado es :"+cociente); //esta linea depende de que la operacion se haya realizado

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("NO SE PUEDE DIVIDIR POR CERO"+e.getMessage());
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("INGRESE UN NÚMERO");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("SUCEDIÓ UN ERROR.");
        }
    }
}
