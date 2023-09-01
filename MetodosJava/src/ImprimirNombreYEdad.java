/*2. Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad)
que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años". */

public class ImprimirNombreYEdad {
    public static void main(String[] args) {
        String nombre = "Lucrecia";
        int edad = 27;
        imprimeNombreYEdad(nombre,edad);
    }
    public static void imprimeNombreYEdad(String argNombre, int argEdad){
        System.out.println("Hola, mi nombre es "+argNombre+" y mi edad es "+argEdad);
    }
}
