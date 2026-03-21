import Modelo.Ala;
import Modelo.EstadoAla;

public class App {
    public static void main(String[] args) throws Exception {
        
        Ala alaIzq = new Ala("rojo","aluminio");
        Ala alaDer = new Ala("verde","aluminio");

        System.err.println("El material del Ala Derecha es: "+alaDer.getMaterial());
        System.err.println("El material del Ala Izquierda es: "+alaIzq.getMaterial());
        System.out.println("La envergadura del material es: "+alaIzq.getEnvergadura());
        System.out.println("estado del flap izquierdo: "+alaIzq.getFlap());
        System.out.println("estadp del flap derecho: "+alaDer.getFlap());
        alaDer.setFlap(EstadoAla.extendido);
        alaIzq.setFlap(EstadoAla.extendido);
        System.out.println("estado del flap izquierdo: "+alaIzq.getFlap());
        System.out.println("estadp del flap derecho: "+alaDer.getFlap());
         
    }
}
