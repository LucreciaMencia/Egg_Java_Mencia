import java.util.Scanner;

public class EggJavaMO2013 {
    public static void main(String[] args) throws Exception {
        Scanner nombre = new Scanner(System.in);
        Scanner edad = new Scanner(System.in);

        System.out.print("Ingresar nombre :");
        String nombreIngresado = nombre.next();

        System.out.print("Ingresar edad :");
        int edadIngresada = edad.nextInt();

        System.out.print("Su nombre es "+nombreIngresado+", y su edad es "+edadIngresada+".");



    }
}
