package Modelo;

public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int numModos;
    private Sistema tipoSistema;
    
    public SistemaDeControlDeVuelo() {
    }

    public SistemaDeControlDeVuelo(String fabricante, int numModos, Sistema tipoSistema) {
        this.fabricante = fabricante;
        this.numModos = numModos;
        this.tipoSistema = tipoSistema;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getNumModos() {
        return numModos;
    }

    public Sistema getTipoSistema() {
        return tipoSistema;
    }

    public void setTipoSistema(Sistema tipoSistema) {
        this.tipoSistema = tipoSistema;
    }
}
