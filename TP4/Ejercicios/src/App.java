import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Pagable> pendientes = new ArrayList<>();

        pendientes.add(new Empleado("Martin",12000));
        pendientes.add(new Factura(250, 20));

        double total = GestorPago.calcularTotal(pendientes);
        System.out.println("Valor total: "+total);

        Cliente c = new Cliente();
        c.getEmail();
        c.obtenerEmail();

        String[] datos = {"10","20","30"};
        int[] datoConvertido = new int[datos.length];
        int suma = 0;
        for(int i = 0; i < datos.length;i++){
            datoConvertido[i] = Integer.parseInt(datos[i]);
            suma += datoConvertido[i];
        }
        System.out.println("Promedio es: "+suma/datoConvertido.length);
        

    }
}
