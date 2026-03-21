package Modelo;

public class MotorDeAvion {
    private String marca;
    private int caballoFuerza;
    private double empuje;
    private EstadoMotor estadoMotor;

    public MotorDeAvion(String marca, int caballoFuerza, double empuje) {
        this.marca = marca;
        this.caballoFuerza = caballoFuerza;
        this.empuje = empuje;
        this.estadoMotor = EstadoMotor.apagado;
    }
    public String getMarca() {
        return marca;
    }
    public int getHp() {
        return caballoFuerza;
    }
    public double getEmpuje() {
        return empuje;
    }
    public EstadoMotor getEstado() {
        return estadoMotor;
    }
    public void setEstado(EstadoMotor estadoMotor) {
        this.estadoMotor = estadoMotor;
    }
    @Override
    public String toString() {
        return "Motor de avion [caballoFuerza: " + caballoFuerza + ", empuje: " + empuje + "]";
    }
    
    
}
