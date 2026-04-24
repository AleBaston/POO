package modelo;

public class Cliente {
    private String nombre;
    private String email;


    public void obtenerEmail(){
        System.out.println(email);
    }
    
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }
    
}
