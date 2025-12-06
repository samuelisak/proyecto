package m10;

public class Producto {
    public static void main(String[] args) {

    }

    // Atributos privados
    private String referencia;
    private int stock;
    private double precioUnitario;

    // Constructor
    public Producto(String referencia, int stock, double precioUnitario) {
        this.referencia = referencia;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    // Comportamiento 1: Incrementar stock
    public void ingresarMercancia(int cantidadEntrada) {
        this.stock += cantidadEntrada;
    }

    // Comportamiento 2: Valor total del stock
    public double valorTotal() {
        return stock * precioUnitario;
    }
}
