package ejecutarprestamo;

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstituciónEducativa institucion;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona beneficiario, int tiempoMeses, String ciudad, 
                             String nivelEstudio, InstituciónEducativa institucion, double valorCarrera) {
        super(beneficiario, tiempoMeses, ciudad.toUpperCase()); 
        this.nivelEstudio = nivelEstudio;
        this.institucion = institucion;
        this.valorCarrera = valorCarrera;
        calcularValorMensual();
    }

    public void calcularValorMensual() {
        double mensualBase = valorCarrera / getTiempoMeses();
        valorMensual = mensualBase - (mensualBase * 0.10); 
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public InstituciónEducativa getInstitucion() {
        return institucion;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
        calcularValorMensual();
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nNivel de estudio: " + nivelEstudio +
               "\nInstitucion: " + institucion +
               "\nValor de la carrera: $" + String.format("%.2f", valorCarrera) +
               "\nValor mensual a pagar: $" + String.format("%.2f", valorMensual);
    }
}
