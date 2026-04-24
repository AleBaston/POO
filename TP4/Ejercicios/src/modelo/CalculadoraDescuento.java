package modelo;

public class CalculadoraDescuento implements Descuento{
    private double descuento;
    private String tipoCliente;
    
    public void calcularDescuento(String tipoCliente){
        switch (tipoCliente.toLowerCase()) {
            case "comun":
                descuento = 0.1;
                break;
        
            case "vip":
                descuento = 0.2;
                break;
            default:
                descuento = 0;
                break;
        }
    }

    public double getDescuento() {
        return descuento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public void descuentoComun() {
        descuento = 0.1;
    }

    @Override
    public void descuentoVIP() {
        descuento = 0.2; 
    }
    

}
