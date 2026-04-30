package pedidos;

public class CongeladoAire {
    private double nitrgoneo;
    private double oxigeno;
    private double co2;
    private double vaporAgua;

    public CongeladoAire(double nitrgoneo, double oxigeno, double co2, double vaporAgua) {
        this.nitrgoneo = nitrgoneo;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vaporAgua = vaporAgua;
    }

    public double getNitrgoneo() {
        return nitrgoneo;
    }

    public void setNitrgoneo(double nitrgoneo) {
        this.nitrgoneo = nitrgoneo;
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
}
