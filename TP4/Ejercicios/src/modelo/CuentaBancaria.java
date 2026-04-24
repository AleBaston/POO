package modelo;
public class CuentaBancaria {
    private int saldo;
    private String titular;

    public CuentaBancaria(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(int monto){
        this.saldo = saldo + monto;
    }

    public void extraer(int monto){
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= monto;
        }
    }
}
