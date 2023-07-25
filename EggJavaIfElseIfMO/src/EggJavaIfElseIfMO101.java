import java.util.Scanner;
public class EggJavaIfElseIfMO101 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    System.out.print("Escriba una puntuación entre 0 y 100: ");
    int puntuacion = num1.nextInt();

    if (puntuacion < 60){
        System.out.println("F");
    } else if (puntuacion >= 60 && puntuacion < 69){
        System.out.println("D");
    } else if (puntuacion >= 70 && puntuacion < 79 ) {
        System.out.println("C");
    } else if (puntuacion >= 80 && puntuacion < 89) {
        System.out.println("B");
    } else if (puntuacion >= 90) {
        System.out.println("A");
    } else {
            System.out.println("Escriba una puntuación entre 0 y 100");
        }
    }
}
