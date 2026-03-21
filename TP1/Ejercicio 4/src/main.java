import Modelo.Ala;
import Modelo.Avion;
import Modelo.MotorDeAvion;
import Modelo.OpcionSistema;
import Modelo.Sistema;
import Modelo.SistemaDeControlDeVuelo;

public class main {
    public static void main(String[] args) throws Exception {
        Avion avion = new Avion("Boeing", "737-800", 189, OpcionSistema.si, 2);

        Ala ala = new Ala(34,"rojo","aluminio");
        SistemaDeControlDeVuelo sistemaDeControlDeVuelo1 = new SistemaDeControlDeVuelo("Garmin",4,Sistema.manual );
        SistemaDeControlDeVuelo sistemaDeControlDeVuelo2 = new SistemaDeControlDeVuelo("Honeywell",6,Sistema.pilotoAutomatico );
        SistemaDeControlDeVuelo sistemaDeControlDeVuelo3 = new SistemaDeControlDeVuelo("Thales",7,Sistema.pilotoAutomatico );
        MotorDeAvion motor1 = new MotorDeAvion("Lycoming", 180,450.0 );
        MotorDeAvion motor2 = new MotorDeAvion("Pratt & Whitney", 1200,2500.5 );
        MotorDeAvion motor3 = new MotorDeAvion("General Electric", 95000,115000.0 );

        avion.setAla(ala);
        avion.setMotor(motor3);
        avion.setSistemaControlDeVuelo(sistemaDeControlDeVuelo3);

        System.out.println("--- ESTADO ACTUAL DEL AERONAVE ---" +
    "\nAvión: " + avion.getModelo()+avion.getModelo()+
    "\nMotor: " + avion.getMotor() +
    "\nSistema de Vuelo: " + avion.getSistemaControlDeVuelo());
    }
}
