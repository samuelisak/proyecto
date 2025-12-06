package m10;

public class Empleado {
    public static void main(String[] args) {

    }
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencion;

    public Empleado(String claveEmpleado, double salarioMensual, double porcentajeRetencion) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public String getClaveEmpleado() { return claveEmpleado; }
    public void setClaveEmpleado(String claveEmpleado) { this.claveEmpleado = claveEmpleado; }

    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salarioMensual) { this.salarioMensual = salarioMensual; }

    public double getPorcentajeRetencion() { return porcentajeRetencion; }
    public void setPorcentajeRetencion(double porcentajeRetencion) { this.porcentajeRetencion = porcentajeRetencion; }

    // Comportamiento 1
    public double calcularSalarioNeto() {
        return salarioMensual - (salarioMensual * porcentajeRetencion / 100);
    }

    // Comportamiento 2
    public void aumentoSalario(double porcentajeAumento) {
        salarioMensual += salarioMensual * (porcentajeAumento / 100);
    }
}
