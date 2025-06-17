package ejecutarprestamo;

public class Persona {
    private String nombre;
    private String apellido;
    private String userName;

    public Persona(String nombre, String apellido, String userName) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + userName + ")";
    }
}
