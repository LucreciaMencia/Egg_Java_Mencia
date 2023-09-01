/*Calculadora: Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método
llamado "menu()" que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de
opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir".
Solicita dos números al usuario y realiza la operación
matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero.*/


import java.util.Scanner;
public class Calculadora {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int opcionELegida = menu();
        if(opcionELegida == 5){
            System.out.println("El programa ha finalizado.");
        }else {
            int primerNumero = ingresarNumeroUno();
            int segundoNumero = ingresarNumeroDos(opcionELegida);

            switch (opcionELegida) {
                case 1:
                    suma(primerNumero, segundoNumero);
                    break;
                case 2:
                    resta(primerNumero, segundoNumero);
                    break;
                case 3:
                    multiplicacion(primerNumero, segundoNumero);
                    break;
                case 4:
                    division(primerNumero, segundoNumero);
                    break;
                default:
                    System.out.println("default main");
            }
        }
    }
    public static int ingresarNumeroUno(){
        System.out.println("Ingrese el primer numero");
        return lector.nextInt();
    }
    public static int ingresarNumeroDos(int posibleDivision){
        int i = posibleDivision;
        int numeroDos;
        if(i == 4) {
            do{
                System.out.println("Ingrese el segundo numero");
                System.out.println("No elija cero como dividendo");
                numeroDos = lector.nextInt();
            }while(0 == numeroDos);
            return numeroDos;
        }else{
            System.out.println("Ingrese el segundo numero");
            return lector.nextInt();
        }

    }
    public static int menu(){
        boolean salir = false;
        do {
            System.out.println("MENU DE LA CALCULADORA");
            System.out.println("1 - suma");
            System.out.println("2 - resta");
            System.out.println("3 - multiplicacion");
            System.out.println("4 - division");
            System.out.println("5 - salir");
            int opcion = lector.nextInt();
            if(opcion < 5){
                switch (opcion){
                    case 1 -> {return 1;}
                    case 2 -> {return 2;}
                    case 3 -> {return 3;}
                    case 4 -> {return 4;}
                    default -> {System.out.println("default");}
                }
            }else if(opcion == 5){
                salir = true;
                break;
            }else{
                System.out.println("Elija una opcion disponible");
            }
        }while (salir);
        return 5;
    }
    public static void suma(int sumandosUno, int sumandosDos){
        int resutlado = sumandosUno+sumandosDos;
        System.out.println("El resultado es "+resutlado);
    }
    public static void  resta(int minuendo, int sustraendo){
        int resultado = minuendo-sustraendo;
        System.out.println("El resultado es "+resultado);

    }
    public static void multiplicacion(int multiplicando, int multiplicador){
        int resultado = multiplicador * multiplicando;
        System.out.println("El resultado es "+resultado);
    }
    public static void division(int dividendo, int divisor){
        int resultado = dividendo/divisor;
        System.out.println("El resultado es "+resultado);
    }
}
