package m10;

public class Vuelo {
    public static void main(String[] args) {

    }
    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    public Vuelo(String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    public String getCodigoVuelo() { return codigoVuelo; }
    public void setCodigoVuelo(String codigoVuelo) { this.codigoVuelo = codigoVuelo; }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public int getAsientosReservados() { return asientosReservados; }
    public void setAsientosReservados(int asientosReservados) { this.asientosReservados = asientosReservados; }

    // Comportamiento 1: Intentar reservar un asiento
    public boolean reservar() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            return true;
        }
        return false;
    }

    // Comportamiento 2: Porcentaje de ocupación
    public double porcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}
