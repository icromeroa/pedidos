package pedidos;

public class CongeladoAgua extends ProductosCongelados {
    private String salinidad;

    public CongeladoAgua(String fechaCaducidad, int numeroDeLote, String fechaEnvasado, String paisOrigen,
                         int temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidad = salinidad;
    }

    public String getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("CONGELADO POR AGUA -> ");
        super.mostrarInformacion();
        System.out.println(" | Salinidad: " + salinidad + " g/L");
    }
}
