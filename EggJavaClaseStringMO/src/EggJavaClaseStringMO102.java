import java.util.Scanner;
public class EggJavaClaseStringMO102 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        String nombre = lector.next();
        System.out.println("Escriba su apellido: ");
        String apellido = lector.next();
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Su nombre es "+nombreCompleto);
    }
}
