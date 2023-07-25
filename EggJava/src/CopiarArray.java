import java.util.Arrays;
public class CopiarArray {
    public static void main(String[] args){ //esto es un metodo que se usa para ejecutar codigo
        String[] arreglo1 = {"q","w","e","r","t","y"};
        String[] copia = Arrays.copyOf(arreglo1, arreglo1.length);
        //Crea una copia del arreglo original

        String[] parteDeUnaCopia = Arrays.copyOfRange(arreglo1, 1, 4);

         /*Crea una copia de una parte del arreglo original (índices 1 a 2 - El
        tercer parámetro no es inclusivo)
          */
        System.out.println(Arrays.toString(arreglo1));
        System.out.println(Arrays.toString(copia));
        System.out.println(Arrays.toString(parteDeUnaCopia));


    }
}
