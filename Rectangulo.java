package m10;

public class Rectangulo {
    public static void main(String[] args) {

    }

    // Atributos privados
    private double base;
    private double altura;
    private String etiqueta;

    // Constructor
    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    // Getters y Setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getEtiqueta() { return etiqueta; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

    // Comportamiento 1: Calcular área
    public double calcularArea() {
        return base * altura;
    }

    // Comportamiento 2: Calcular perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
