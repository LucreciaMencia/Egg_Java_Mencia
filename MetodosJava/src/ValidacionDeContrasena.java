/*2. Validación de contraseña: Basándose en el ejercicio que ya has realizado,
crea un método "esSegura()" que reciba por parámetro un "String" y devuelva un booleano para comprobar
que la contraseña cumple con los criterios establecidos. También, crea los métodos: "tieneLongitudCorrecta()",
 "tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" y "tieneCaracterEspecial()",
 que reciban por parámetro un "String" y devuelvan un "booleano".*/

import java.util.Scanner;

public class ValidacionDeContrasena {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        menuPassword();
        String passwordIngresado = lector.next();
        if(esSegura(passwordIngresado)){
                System.out.println("La contraseña es segura.");
        }else{
            System.out.println("Aun no es segura.");}
    }
    public static boolean esSegura(String password){
        boolean suficientesCaracteres = tieneLongitudCorrecta(password);
        boolean tieneMayusculas = tieneMayuscula(password);
        boolean tieneMinusculas = tieneMinuscula(password);
        boolean tieneNumeros = tieneNumero(password);
        boolean tieneCaracteresEspeciales = tieneCaracterEspecial(password);

        return suficientesCaracteres
                && tieneMayusculas
                && tieneMinusculas
                && tieneNumeros
                && tieneCaracteresEspeciales;
    }
    public static boolean tieneCaracterEspecial(String password){
        if (password.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("Tiene al menos un caracter especial");
            return true;
        } else {
            System.out.println("Debe contener al menos un carácter especial.");
            return false;
        }
    }
    public static boolean tieneNumero(String password){
        if (password.matches(".*[0-9].*")){
            System.out.println("Tiene al menos una número.");
            return true;
        } else{
            System.out.println("Debe contener al menos un número.");
            return false;
        }
    }
    public static boolean tieneLongitudCorrecta(String password){
        if (password.length() >= 8) {
            System.out.println("Tiene al menos 8 caracteres.");
            return true;
        } else {
            System.out.println("Constraseña no válida: debe tener al menos 8 caracteres.");
            return false;
        }
    }
    public static boolean tieneMayuscula(String password){
        if(password.matches(".*[A-Z].*]")){
            System.out.println("Tiene al menos una letra mayúscula.");
            return true;
        } else {
            System.out.println("Debe contener al menos una letra mayúscula");
            return false;
        }
    }
    public static boolean tieneMinuscula(String password){
        if (password.matches(".*[a-z].*")) {
            System.out.println("Tiene al menos una letra minúscula.");
            return true;
        } else {
            System.out.println("Debe contener al menos una letra minúscula");
            return false;
        }
    }
    public static void menuPassword(){
        System.out.println("Verificación de contraseña");
        System.out.println("La contraseña debe cumplir con las siguientes características:");
        System.out.println("Debe tener al menos: 8 caracteres.");
        System.out.println("Una letra mayúscula y una letra minúscula.");
        System.out.println("Un número.");
        System.out.println("Un carácter especial (por ejemplo, !, @, #, $).");
        System.out.println("Ingrese la contraseña");
    }
}
