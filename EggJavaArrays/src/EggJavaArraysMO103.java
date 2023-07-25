/*Encontrar el máximo: Escribir un programa que cree un array de 3 enteros
y devuelva el valor máximo presente en el array, sin usar el bucle for.
 */
import java.util.Arrays;
import java.util.Scanner;
public class EggJavaArraysMO103 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ENCONTRAR EL VALOR MÁXIMO EN EL ARRAY");
        System.out.println("El Array tendrá 3 valores.");
        double[] vector = new double[3];
        System.out.println("Ingrese el primer valor: ");
        vector[0] = lector.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        vector[1] = lector.nextDouble();
        System.out.println("Ingrese el tercer valor: ");
        vector[2] = lector.nextDouble();
        System.out.println("El array contiene los siguientes números: "+Arrays.toString(vector));
        Arrays.sort(vector);
        System.out.println("El valor máximo en el Array es: "+vector[(vector.length)-1]);
    }
}
