package modelo;

public class EmpleadoContratado extends Empleado{
    private int horasTrabajadas;
    private double valorHora;
    
    public EmpleadoContratado(String nombre, double sueldo, int horasTrabajadas, double valorHora) {
        super(nombre, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double getSueldo() {
        return valorHora * horasTrabajadas;
    }

    
}
