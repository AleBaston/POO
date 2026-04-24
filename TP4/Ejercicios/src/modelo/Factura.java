package modelo;

public class Factura implements Pagable{
    private double monto;
    private int cantidad;

    
    public Factura(double monto, int cantidad) {
        this.monto = monto;
        this.cantidad = cantidad;
    }


    @Override
    public double calcularPago() {
        
        return monto * cantidad;
    }

}
