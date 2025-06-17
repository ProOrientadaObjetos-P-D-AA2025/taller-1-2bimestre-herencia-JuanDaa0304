package ejecutarprestamo;

public class PrestamosAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamosAutomovil(Persona beneficiario, int tiempoMeses, String ciudad,
            String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoMeses, ciudad.toLowerCase()); 
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        calcularValorMensual();
    }

    public double calcularValorMensual() {
        if (getTiempoMeses() > 0) {
            this.valorMensual = valorAutomovil / getTiempoMeses();
            
        } else {
            this.valorMensual = 0;
        }
        return valorMensual;
    }

    public void ObtenerCiudad(String ciudad) {
        super.setCiudad(ciudad.toLowerCase());
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
        calcularValorMensual(); 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nTipo de automovil: " + tipoAutomovil +
               "\nMarca del automovil: " + marcaAutomovil +
               "\nGarante: " + garante1 +
               "\nValor del automovil: $" + String.format("%.2f", valorAutomovil) +
               "\nValor mensual a pagar: $" + String.format("%.2f", valorMensual);
    }
}
