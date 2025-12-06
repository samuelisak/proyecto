package m10;

public class Automovil {
    public static void main(String[] args) {

    }
    private String marca;
    private int anioFabricacion;
    private int velocidadMaxima;

    public Automovil(String marca, int anioFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnioFabricacion() { return anioFabricacion; }
    public void setAnioFabricacion(int anioFabricacion) { this.anioFabricacion = anioFabricacion; }

    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    // Comportamiento 1
    public String encender() {
        if (anioFabricacion > 1990) {
            return "Encendido exitoso.";
        }
        return "El vehículo es muy antiguo y no encendió.";
    }

    // Comportamiento 2
    public int calcularAntiguedad(int anioActual) {
        return anioActual - anioFabricacion;
    }
}

