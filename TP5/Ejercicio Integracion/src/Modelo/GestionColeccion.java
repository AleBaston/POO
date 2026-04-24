package Modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GestionColeccion {
    private Set<Libro> libros = new HashSet<>();;

    public void agregarLibro(Libro l){
        if(libros.add(l)) {
            System.out.println("Libro agregado: " + l.getTitulo());
        } else {
            System.out.println("El libro ya existe en la biblioteca.");
        }
    }

    public void eliminarLibro(Libro l){
        libros.remove(l);
    }

    public void buscarLibroPorIsbn(String isbn){
        boolean encontrado = false;
        
        Iterator<Libro> it = libros.iterator();
        
        while(it.hasNext()){
            Libro actual = it.next(); 
            if (actual.getISBN().equals(isbn)) {
                System.out.println("Se encontró: " + actual);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ISBN: " + isbn);
        }
    }
    public void mostrarTodos() {
        for (Libro l : libros) System.out.println(l);
    }
}
