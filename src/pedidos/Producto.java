package pedidos;

public class Producto {
    private String fechaCaducidad;
    private int numeroDeLote;
    private String fechaEnvasado;
    private String paisOrigen;

    public Producto(String fechaCaducidad, int numeroDeLote, String fechaEnvasado, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroDeLote = numeroDeLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void mostrarInformacion() {
        System.out.print("Lote: " + numeroDeLote + " | Caducidad: " + fechaCaducidad +
                " | Envasado: " + fechaEnvasado + " | Origen: " + paisOrigen);
    }
}
