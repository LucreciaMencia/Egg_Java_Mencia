import java.util.Scanner;
public class EggJavaClaseStringMO103 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String frase = lector.nextLine();  // nextLine para oraciones
        System.out.println("Escriba un número: ");
        int primerIndice = lector.nextInt();
        System.out.println("Escrina otro número: ");
        int segundoIndice = lector.nextInt();

        System.out.println("La subcadena resultante de sus índices es: "+frase.substring(primerIndice, segundoIndice));
    }
}
