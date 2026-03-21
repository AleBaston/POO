import Modelo.Sistema;
import Modelo.SistemaDeControlDeVuelo;

public class App {
    public static void main(String[] args) throws Exception {
        
        SistemaDeControlDeVuelo modelo1 = new SistemaDeControlDeVuelo("Garmin",4,Sistema.manual );
        SistemaDeControlDeVuelo modelo2 = new SistemaDeControlDeVuelo("Honeywell",6,Sistema.pilotoAutomatico );
        SistemaDeControlDeVuelo modelo3 = new SistemaDeControlDeVuelo("Thales",7,Sistema.pilotoAutomatico );
        
        System.out.println("Fabricantes de los modelos: \n -Modelo1: "+modelo1.getFabricante()+"\n -Modelo2: "+modelo2.getFabricante()+"\n -Modelo3: "+modelo3.getFabricante());
        System.out.println("Modo actual de los modelos: \n -Modelo1: "+modelo1.getTipoSistema()+"\n -Modelo2: "+modelo2.getTipoSistema()+"\n -Modelo3: "+modelo3.getTipoSistema());
    }
}
