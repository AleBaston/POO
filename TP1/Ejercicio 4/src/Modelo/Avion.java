package Modelo;

public class Avion {
    private String marca;
    private String modelo;
    private Ala ala;
    private SistemaDeControlDeVuelo SistemaControlDeVuelo;
    private MotorDeAvion motor;
    private int cantAsientos;
    private OpcionSistema sistemaEntrenamiento;
    private int cantAlas;
    
    public Avion(String marca, String modelo, int cantAsientos, OpcionSistema sistemaEntrenamiento, int cantAlas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantAsientos = cantAsientos;
        this.sistemaEntrenamiento = OpcionSistema.no;
        if (cantAlas < 2 || cantAlas > 6 || cantAlas % 2 !=0) {
            this.cantAlas = 2;
        }
        else{
            this.cantAlas = cantAlas;
        }
        
        
    }

    public int getCantAlas() {
        return cantAlas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public OpcionSistema tieneSistemaEntrenamiento() {
        return sistemaEntrenamiento;
    }

    public Ala getAla() {
        return ala;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public SistemaDeControlDeVuelo getSistemaControlDeVuelo() {
        return SistemaControlDeVuelo;
    }

    public void setSistemaControlDeVuelo(SistemaDeControlDeVuelo sistemaControlDeVuelo) {
        SistemaControlDeVuelo = sistemaControlDeVuelo;
    }

    public MotorDeAvion getMotor() {
        return motor;
    }

    public void setMotor(MotorDeAvion motor) {
        this.motor = motor;
    }

    

    
}
