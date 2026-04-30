package pedidos;

public class ProductosRefrigerados {
    private int codigoOrganismo;
    private int temperaturaRecomendada;

    public ProductosRefrigerados(int codigoOrganismo, int temperaturaRecomendada) {
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
}
