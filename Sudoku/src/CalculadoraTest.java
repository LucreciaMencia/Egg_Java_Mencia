public class CalculadoraTest {

    public static void main(String[] args) {
        CalculadoraTest losTest = new CalculadoraTest(); //losTest es una variable que guarda una instancia de la clase CalculadoraTest
        losTest.puedeDividirDosNumeros();
        losTest.fallaAlDividirPorCero();
    }

    public void puedeDividirDosNumeros(){ //metodo que testea a otro
        Calculadora calculator = new Calculadora();

        double resultado = calculator.dividir(8,2); //dividir es el metodo que es testeado

        assert resultado == 4: "La división falló"; // esta aseveracion es la condicion que determina si el test pasa o falla
    }

    public void fallaAlDividirPorCero(){
        Calculadora calculator = new Calculadora();
        double resultado = calculator.dividir(2,0);
    }
}



