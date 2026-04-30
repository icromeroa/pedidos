package pedidos;

public class ProductosRefrigerados extends Producto {
    private int codigoOrganismo;
    private int temperaturaRecomendada;

    public ProductosRefrigerados(String fechaCaducidad, int numeroDeLote, String fechaEnvasado,
                                 String paisOrigen, int codigoOrganismo, int temperaturaRecomendada) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("PRODUCTO REFRIGERADO -> ");
        super.mostrarInformacion();
        System.out.println(" | Org. Supervisión: " + codigoOrganismo + " | Temp. Recomendada: " + temperaturaRecomendada + "°C");
    }
}
