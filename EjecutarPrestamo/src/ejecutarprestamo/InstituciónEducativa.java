package ejecutarprestamo;

public class InstituciónEducativa {
    private String nombre;
    private String siglas;

    public InstituciónEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }
        @Override
    public String toString() {
        return nombre + " (" + siglas + ")";
    }
}
