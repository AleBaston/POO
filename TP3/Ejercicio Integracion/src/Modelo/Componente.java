package Modelo;

public class Componente {
    private EstadoComponente estadoComponente;
    private String tipoComponente;
    private int costo;

    public Componente(EstadoComponente estadoComponente, String tipoComponente, int costo) {
        this.estadoComponente = estadoComponente;
        this.tipoComponente = tipoComponente;
        this.costo = costo;
    }

    public EstadoComponente getEstadoComponente() {
        return estadoComponente;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public int getCosto() {
        return costo;
    }

    public void cambiarValorComponente(int costo) {
        this.costo = costo;
    }

}
