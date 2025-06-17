package ejecutarprestamo;

public class Prestamo {

    private Persona beneficiario;
    private int tiempoMeses;
    private String ciudad;

    public Prestamo(Persona beneficiario, int tiempoMeses, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudad = ciudad.toUpperCase();
    }

    
    public Persona getBeneficiario() {
        return beneficiario;
    }

    public int getTiempoMeses() {
        return tiempoMeses;
    }

    public String getCiudad() {
        return ciudad;
    }

    
    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    @Override
    public String toString() {
        return "Prestamo a nombre de: " + beneficiario +
               "\nDuracion: " + tiempoMeses + " meses" +
               "\nCiudad: " + ciudad;
    }
}
