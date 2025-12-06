package m10;

public class Temperatura {
    public static void main(String[] args) {

    }
    private double valor;
    private String unidad; // "C" para Celsius, "F" para Fahrenheit
    private String fechaRegistro;

    public Temperatura(double valor, String unidad, String fechaRegistro) {
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    // Comportamiento 1: Convertir entre Celsius y Fahrenheit
    public void convertir() {
        if (unidad.equalsIgnoreCase("C")) {
            valor = valor * 9 / 5 + 32;
            unidad = "F";
        } else if (unidad.equalsIgnoreCase("F")) {
            valor = (valor - 32) * 5 / 9;
            unidad = "C";
        }
    }

    // Comportamiento 2: Evaluar si es temperatura extrema (> 40°C)
    public boolean esExtrema() {
        double valorCelsius = unidad.equalsIgnoreCase("C") ? valor : (valor - 32) * 5 / 9;
        return valorCelsius > 40;
    }
}
