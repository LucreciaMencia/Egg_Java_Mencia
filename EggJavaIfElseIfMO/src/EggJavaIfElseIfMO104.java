import java.util.Scanner;
public class EggJavaIfElseIfMO104 {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        String passwordSaved = "1234Rodrigo";

        System.out.print("Ingrese su contraseña: ");
        String passwordEntered = password.nextLine();

        if (passwordEntered.equals(passwordSaved)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Accedo denegado.");
        }
    }
}
