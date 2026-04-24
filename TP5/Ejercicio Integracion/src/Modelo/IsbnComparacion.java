package Modelo;

import java.util.Comparator;

public class IsbnComparacion implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getISBN().compareTo(o2.getISBN());
    }

   

}
