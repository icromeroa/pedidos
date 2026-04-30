package pedidos;

public class CongeladoAire extends ProductosCongelados {
    private double nitrogeno;
    private double oxigeno;
    private double co2;
    private double vaporAgua;

    public CongeladoAire(String fechaCaducidad, int numeroDeLote, String fechaEnvasado, String paisOrigen,
                         int temperaturaRecomendada, double nitrogeno, double oxigeno,
                         double co2, double vaporAgua) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vaporAgua = vaporAgua;
    }

    public double getNitrogneo() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrgoneo) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("CONGELADO POR AIRE -> ");
        super.mostrarInformacion();
        System.out.println(" | Composición Aire: N2:" + nitrogeno + "% O2:" + oxigeno +
                "% CO2:" + co2 + "% H2O:" + vaporAgua + "%");
    }
}
