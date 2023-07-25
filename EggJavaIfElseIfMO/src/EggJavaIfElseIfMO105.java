import java.util.Scanner;

public class EggJavaIfElseIfMO105 {
    public static void main(String[] args) {
    Scanner precio = new Scanner(System.in);

    System.out.print("Escriba el precio del producto: ");
    int precioIngresado = precio.nextInt();

        if (precioIngresado >= 100) {
            System.out.println("El precio con el 10% de descuento es $"+(precioIngresado-(precioIngresado*0.10)));
        } else {
            System.out.println("El precio se mantiene en $"+precioIngresado);
        }
    }
}
