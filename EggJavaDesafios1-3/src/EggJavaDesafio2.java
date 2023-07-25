import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class EggJavaDesafio2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        float resultado;

      System.out.println("Calculadora");
      System.out.print("Ingrese primer número: ");
      float numIngresado1 = num1.nextFloat();

      System.out.print("Ingrese otro número: ");
      float numIngresado2 = num2.nextFloat();

      System.out.println("1 - sumar");
      System.out.println("2 - restar");
      System.out.println("3 - multiplicar");
      System.out.println("4 - dividir");
      System.out.println("Ingrese el número de opción del cálculo que quiere realizar: ");
        int calculoElegido = num3.nextInt();

        resultado = (calculoElegido == 1 ) ? (numIngresado1+numIngresado2) : (
                (calculoElegido == 2) ? (numIngresado1-numIngresado2) : (
                        (calculoElegido == 3) ? (numIngresado1*numIngresado2) : (
                                (calculoElegido == 4) ? (numIngresado1/numIngresado2) : 0
                                )
                )
        );
      System.out.print(resultado);
    }
}
