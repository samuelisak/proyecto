package m10;

public class CuentaAhorros {
    public static void main(String[] args) {

    }
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaAhorros(String numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public String getNombreTitular() { return nombreTitular; }
    public void setNombreTitular(String nombreTitular) { this.nombreTitular = nombreTitular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Comportamiento 1
    public void deposito(double cantidad) {
        saldo += cantidad;
    }

    // Comportamiento 2
    public boolean retiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
