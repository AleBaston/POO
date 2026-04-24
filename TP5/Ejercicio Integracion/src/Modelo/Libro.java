package Modelo;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String ISBN;
    
    public Libro(String titulo, String autor, int añoPublicacion, String iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion + ", ISBN=" + ISBN
                + "]";
    }

    @Override
    public int compareTo(Libro o) {
        return Integer.compare(this.añoPublicacion, o.añoPublicacion);
        
    }

    
}
