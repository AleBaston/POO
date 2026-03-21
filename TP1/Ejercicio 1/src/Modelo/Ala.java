package Modelo;

public class Ala {
    private int envergadura;
    private String color;
    private String material;
    private EstadoAla flap;
    
    public Ala() {
    }

    public Ala(String color, String material) {
        this.envergadura = 12;
        this.color = color;
        this.material = material;
        this.flap = EstadoAla.retraido;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public EstadoAla getFlap() {
        return flap;
    }

    public void setFlap(EstadoAla flap) {
        this.flap = flap;
    }

    
}
