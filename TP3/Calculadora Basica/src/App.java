import Modelo.Calculadora;
public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dividir(10, 3));
        System.out.println(calculadora.suma(5, 7));
        System.out.println(calculadora.multiplicar(2, 6));
        System.out.println(calculadora.resta(6, 10));
    }
}
