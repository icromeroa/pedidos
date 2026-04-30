package pedidos;

public class ProductosCongelados extends Producto {
    private int temperaturaRecomendada;

    public ProductosCongelados(String fechaCaducidad, int numeroDeLote, String fechaEnvasado,
                               String paisOrigen, int temperaturaRecomendada) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.print(" | Temp. Recomendada: " + temperaturaRecomendada + "°C");
    }
}
