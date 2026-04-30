package pedidos;

public class ProductosFrescos extends Producto {
    public ProductosFrescos(String fechaCaducidad, int numeroDeLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroDeLote, fechaEnvasado, paisOrigen);
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("PRODUCTO FRESCO -> ");
        super.mostrarInformacion();
        System.out.println();
    }
}
