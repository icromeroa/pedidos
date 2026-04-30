package pedidos;

public class CongeladoNitrogeno extends ProductosCongelados {
    private String metodoCongelacion;
    private double tiempoExposicion;

    public CongeladoNitrogeno(String fechaCaducidad, int numeroDeLote, String fechaEnvasado, String paisOrigen,
                              int temperaturaRecomendada, String metodoCongelacion, int tiempoExposicionSegundos) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("CONGELADO POR NITRÓGENO -> ");
        super.mostrarInformacion();
        System.out.println(" | Método: " + metodoCongelacion + " | Tiempo: " + tiempoExposicion + " seg.");
    }
}
