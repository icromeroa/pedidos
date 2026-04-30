package pedidos;

public class TestHerencia3 {
    public static void main(String[] args) {
        // 2 Productos Frescos
        ProductosFrescos fresco1 = new ProductosFrescos("2026-05-15", 1001, "2026-04-20", "España");
        ProductosFrescos fresco2 = new ProductosFrescos("2026-05-18", 1002, "2026-04-21", "Argentina");

        // 3 Productos Refrigerados
        ProductosRefrigerados refri1 = new ProductosRefrigerados("2026-06-10", 2001, "2026-04-25", "Francia", 12345, 4);
        ProductosRefrigerados refri2 = new ProductosRefrigerados("2026-06-12", 2002, "2026-04-25", "Italia", 54321, 5);
        ProductosRefrigerados refri3 = new ProductosRefrigerados("2026-06-15", 2003, "2026-04-26", "España", 99887, 3);

        // 5 Productos Congelados
        CongeladoAgua conAgua1 = new CongeladoAgua("2027-01-01", 3001, "2026-04-10", "Chile", -18, 35.0);
        CongeladoAgua conAgua2 = new CongeladoAgua("2027-01-15", 3002, "2026-04-12", "Perú", -20, 32.5);

        CongeladoAire conAire1 = new CongeladoAire("2027-02-01", 4001, "2026-04-15", "España", -25, 78.0, 21.0, 0.03, 0.97);
        CongeladoAire conAire2 = new CongeladoAire("2027-02-10", 4002, "2026-04-16", "Portugal", -22, 79.0, 20.0, 0.5, 0.5);

        CongeladoNitrogeno conNitro1 = new CongeladoNitrogeno("2027-05-20", 5001, "2026-04-28", "Holanda", -196, "Criogenia rápida", 150);

        // Imprimir todo
        System.out.println("=== LISTADO DE GESTIÓN AGROALIMENTARIA ===");
        fresco1.mostrarInformacion();
        fresco2.mostrarInformacion();
        refri1.mostrarInformacion();
        refri2.mostrarInformacion();
        refri3.mostrarInformacion();
        conAgua1.mostrarInformacion();
        conAgua2.mostrarInformacion();
        conAire1.mostrarInformacion();
        conAire2.mostrarInformacion();
        conNitro1.mostrarInformacion();
    }
}