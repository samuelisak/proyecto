package m10;

public class TareaPendiente {
    public static void main(String[] args) {

    }
    private String descripcion;
    private String prioridad; // Baja, Media, Alta
    private boolean completada;

    public TareaPendiente(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    // Comportamiento 1
    public void marcarComoCompletada() {
        completada = true;
    }

    // Comportamiento 2
    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }
}
