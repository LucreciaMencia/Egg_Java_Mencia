/*Verificar si una cadena representa un número válido:
Pide al usuario que ingrese una cadena.
Intenta convertir la cadena a un doble usando Double.valueOf().
Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción.
Atrapa esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.*/

import java.util.Scanner;
public class EggJavaEnvolturaWrappersMO105 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try{
            System.out.println("Ingrese un número decimal");
            String numDouble = lector.next();
            double numDecimal = Double.valueOf(numDouble);
            System.out.println(numDecimal);
        } catch (NumberFormatException e){
            System.out.println("Ingrese un número válido");
        }
    }
}
