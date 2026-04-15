package Modelo;

public class Televisor {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private int pulgadas;
    private String resolucion;
    private boolean esSmart;
    private TipoTelevisor tipo;
    private boolean estaEncendido = false;
    private Componente[] componentes = new Componente[5];
    private int contador = 0;
    
    public Televisor(String marca, String modelo, int añoFabricacion, int pulgadas, String resolucion, boolean esSmart,
            TipoTelevisor tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.esSmart = esSmart;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

    public TipoTelevisor getTipo() {
        return tipo;
    }

    public void agregarComponente(Componente nuevoComponente) {
        if (contador < componentes.length) {
            componentes[contador] = nuevoComponente; // Guardamos en la posición actual
            contador++; // Movemos el contador al siguiente lugar
        } else {
            System.out.println("No hay más espacio para componentes en este televisor.");
        }
    }

    @Override
    public String toString() {
        // Armamos el String con el formato que pidió la consigna
        String smartTexto = esSmart ? "Smart" : "No Smart";
        return marca + " -- " + pulgadas + " pulgadas -- " + resolucion + " -- " + smartTexto;
    }

    public void encender() {
        if (!estaEncendido) {
            estaEncendido = true;
            System.out.println("El televisor " + marca + " se ha encendido.");
        } else {
            System.out.println("El televisor ya estaba encendido.");
        }
    }

    public void apagar() {
        if (estaEncendido) {
            estaEncendido = false;
            System.out.println("El televisor " + marca + " se ha apagado.");
        } else {
            System.out.println("El televisor ya estaba apagado.");
        }
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    
}
