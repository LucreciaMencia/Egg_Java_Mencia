/*Escribir un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios
para considerarse segura:
   1 La contraseña debe tener al menos 8 caracteres.
   2 La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
   3 La contraseña debe contener al menos un número.
   4 La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos.

Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.
*/
import java.util.Scanner;
public class EggJavaDesafios2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Verificación de contraseña");
        System.out.println("La contraseña debe cumplir con las siguientes características:");
        System.out.println("Debe tener al menos: 8 caracteres.");
        System.out.println("Una letra mayúscula y una letra minúscula.");
        System.out.println("Un número.");
        System.out.println("Un carácter especial (por ejemplo, !, @, #, $).");
        System.out.println("Ingrese la contraseña");
        String password = lector.next();
            if (password.length() >= 8) {
                System.out.println("Tiene al menos 8 caracteres.");
            } else {
                System.out.println("Constraseña no válida: debe tener al menos 8 caracteres.");
            }

            if (password.matches(".*[a-z].*")) {
                System.out.println("Tiene al menos una letra minúscula.");
            } else {
                System.out.println("Debe contener al menos una letra minúscula");
            }
            if(password.matches(".*[A-Z].*]")){
                System.out.println("Tiene al menos una letra mayúscula.");
            } else {
                System.out.println("Debe contener al menos una letra mayúscula");
            }
            if (password.matches(".*[0-9].*")){
                System.out.println("Tiene al menos una número.");
            } else{
                System.out.println("Debe contener al menos un número.");
        }

            if (password.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("Tiene al menos un caracter especial");
            } else {
                System.out.println("Debe contener al menos un carácter especial.");
            }
    }
}
//[^a-zA-Z0-9] busca caracteres que no sean los espcificados dentro de los corchetes
//^ indica negacion
////Rangos, se usa para que incluya un rango de caracteres. Por ejemplo, para que incluya los caracteres entre a y z [a-z]
  //  Cualquier carácter: se usa un punto.
//Repetición: se usa el símbolo *, indica que un conjunto de caracteres se pueden repetir o no.