import java.util.Arrays;

public class Aplication {
    public static void main(String[] args){
      /*  int[] arreglo = {9,5,7,8,2,1};
        System.out.println(arreglo.toString());
        System.out.println(Arrays.toString(arreglo));
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
      */
        Persona rodri = new Persona();
        rodri.nombreCompleto = "Lucrecia Sabrina Mencia";
        rodri.genero = "Masculino";
        rodri.edad = 29;

        System.out.println(rodri.obtenerNombreEnMayuscula());
    }
}