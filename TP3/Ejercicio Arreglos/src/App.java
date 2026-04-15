import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double[] arregloNotas = {6.3, 9.8, 8.75, 8.15, 9.5};

        for (int i = 0; i < arregloNotas.length; i++){

            System.out.println("Nota de alumno "+(i+1)+": "+arregloNotas[i]);

        }

        double sumTotal = 0;

        for (int i = 0; i < arregloNotas.length;i++){
            sumTotal = sumTotal + arregloNotas[i];
        }
        System.err.println("El promedio es: "+sumTotal/arregloNotas.length);

        double maximo = arregloNotas[0];
        double minimo = arregloNotas[0];
        for(int i = 0; i < arregloNotas.length-1;i++){
            if (minimo > arregloNotas[i+1]){
                minimo = arregloNotas[i+1];
            }
            if (maximo < arregloNotas[i+1]){
                maximo = arregloNotas[i+1];
            }
        }
        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);

        int[] notas = {6, 5, 7, 8, 9};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nota = teclado.nextInt();
        String resultado = "No";
        for(int i = 0; i < notas.length;i++){
            if (notas[i] == nota){
                resultado = "Si";
            }
        }
        System.out.println("Su numero se encuentra en la lista: "+resultado);
    }
}
