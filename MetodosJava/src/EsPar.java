/*Es par: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()"
que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un
método llamado "esPar()"
que reciba por parámetro un entero y devuelva un booleano.*/


import java.util.Scanner;

public class EsPar {
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
           int num =  solicitarNumero();
           esPar(num);
        }
    }
    public static int solicitarNumero(){
        System.out.println("Ingrese un numero ");
        return lector.nextInt();
    }

    public static void esPar(int arg) {
        if(arg%2 == 0){
            System.out.println(arg+" es par.");
        } else {
            System.out.println(arg+" es impar.");
        }
    }

}
