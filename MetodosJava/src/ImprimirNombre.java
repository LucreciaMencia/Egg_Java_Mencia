/*1. Imprimir nombre: Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje
 "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola */

public class ImprimirNombre {
    public static void main(String[] args) {
        imprimeNombre("Lucrecia Sabrina Mencia.");
    }
    public static void imprimeNombre(String nombre){
        System.out.println("Mi nombre es "+nombre);
    }
}
