import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        GestionColeccion biblioteca = new GestionColeccion();
        Scanner sc = new Scanner(System.in);
        
        // Carga rápida de prueba
        Libro l1 = new Libro("Rayuela", "Borges", 1963, "123");
        Libro l2 = new Libro("Ficciones", "Cortázar", 1944, "456");
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        System.out.println("\n--- BIENVENIDO A LA BIBLIOTECA UADE ---");
        
        // Ejemplo de búsqueda por ISBN
        System.out.print("Ingrese ISBN para buscar: ");
        String busqueda = sc.nextLine();
        biblioteca.buscarLibroPorIsbn(busqueda);

        // Ejemplo de uso de Comparator (Punto 3 de la consigna)
        List<Libro> listaOrdenada = new ArrayList<>();
        listaOrdenada.add(l1);
        listaOrdenada.add(l2);
        
        System.out.println("\nOrdenando por Título...");
        listaOrdenada.sort(new TituloComparacion());
        listaOrdenada.forEach(System.out::println);

        System.out.println("\nOrdenando por Autor...");
        listaOrdenada.sort(new AutorComparacion());
        listaOrdenada.forEach(System.out::println);
    }
}
