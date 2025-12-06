package m10;

public class ArticuloBibliografico {
    public static void main(String[] args) {

    }

    // Atributos privados
    private String id;
    private String autor;
    private boolean prestado;
    private int anioPublicacion;

    // Constructor
    public ArticuloBibliografico(String id, String autor, boolean prestado, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.prestado = prestado;
        this.anioPublicacion = anioPublicacion;
    }

    // Métodos Accesores (Getters y Setters)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    // Comportamiento 1: Simular reserva (cambia estado de préstamo)
    public void reservar() {
        this.prestado = !this.prestado;
    }

    // Comportamiento 2: Determinar si es apto para préstamo (antigüedad > 5 años)
    public boolean esAptoParaPrestamo(int anioActual) {
        return (anioActual - anioPublicacion) <= 5;
    }
}

