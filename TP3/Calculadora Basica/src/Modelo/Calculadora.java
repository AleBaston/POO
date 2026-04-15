package Modelo;
public class Calculadora {
    private double resultado;

    public Calculadora() {
    }
    
    //Metodos

    public double suma(double valor1, double valor2){
        resultado = valor1 + valor2;
        return resultado;
    }
    public double resta(double valor1, double valor2){
        resultado = valor1 - valor2;
        return resultado;
    }
    public double multiplicar(double valor1, double valor2){
        resultado = valor1 * valor2;
        return resultado;
    }
    public double dividir(double valor1, double valor2){
        try {
            resultado = valor1 / valor2;
            return resultado;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
        return resultado;
    }
}
