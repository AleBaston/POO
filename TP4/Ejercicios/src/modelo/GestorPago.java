package modelo;

import java.util.List;

public class GestorPago {
    public static double calcularTotal(List<Pagable> listaPagables){
        double total = 0;

        for (Pagable p : listaPagables){
            total += p.calcularPago();
        }

        return total;
    }
}
