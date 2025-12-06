package m10;

public class CadenaTexto {
    public static void main(String[] args) {

    }
    private String cadena;
    private String idModulo;
    private int longitudMaxima;

    public CadenaTexto(String cadena, String idModulo, int longitudMaxima) {
        this.cadena = cadena;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    public String getCadena() { return cadena; }
    public void setCadena(String cadena) { this.cadena = cadena; }

    public String getIdModulo() { return idModulo; }
    public void setIdModulo(String idModulo) { this.idModulo = idModulo; }

    public int getLongitudMaxima() { return longitudMaxima; }
    public void setLongitudMaxima(int longitudMaxima) { this.longitudMaxima = longitudMaxima; }

    // Comportamiento 1: Añadir prefijo
    public String agregarPrefijo(String prefijo) {
        String nuevaCadena = prefijo + cadena;
        if (nuevaCadena.length() <= longitudMaxima) {
            cadena = nuevaCadena;
        }
        return cadena;
    }

    // Comportamiento 2: Contar espacios en blanco
    public int contarEspacios() {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == ' ') contador++;
        }
        return contador;
    }
}
