import Modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Componente pantallaCompartida = new Componente(EstadoComponente.nuevo, "Pantalla OLED 4K", 1500);

        // 2. Creamos dos televisores distintos (Punto 1)
        // Usamos: Marca, Modelo, Año, Pulgadas, Resolución, Smart, TipoEnum
        Televisor tv1 = new Televisor("Samsung", "Series 9", 2024, 55, "4K", true, TipoTelevisor.OLED);
        Televisor tv2 = new Televisor("LG", "NanoCell", 2024, 50, "4K", true, TipoTelevisor.LCD);


        tv1.agregarComponente(pantallaCompartida);
        tv2.agregarComponente(pantallaCompartida);

   
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());

   
        tv1.encender();
        tv2.apagar();
        
        System.out.println("\n--- CONSULTA DE ESTADOS ---");
      
        System.out.println(tv1.getMarca() + " está " + (tv1.isEstaEncendido() ? "Encendido" : "Apagado"));
        System.out.println(tv2.getMarca() + " está " + (tv2.isEstaEncendido() ? "Encendido" : "Apagado"));

        
        
        System.out.println("\n--- MODIFICANDO COSTO DEL COMPONENTE COMPARTIDO ---");
        pantallaCompartida.cambiarValorComponente(2500);

       
        System.out.println("Información actualizada de " + tv1.getMarca() + ":");
        System.out.println(tv1.toString());
        
        System.out.println("Información actualizada de " + tv2.getMarca() + ":");
        System.out.println(tv2.toString());
    }
}
