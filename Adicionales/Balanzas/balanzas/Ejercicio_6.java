package balanzas;

public class Ejercicio_6 {

    public static void main(String[] args) {

        // Creamos una balanza básica.
        Balanza basica = new Balanza();

        // Creamos los productos.
        Producto p1 = new Producto("Zanahoria", "Verdura", 2.0, 1000);
        Producto p2 = new Producto("Manzana", "Fruta", 1.5, 1500);

        // Registramos los productos.
        basica.agregarProducto(p1);
        basica.agregarProducto(p2);

        // Finalizamos la compra.
        Ticket ticket1 = basica.finalizarCompra();

        System.out.println("BALANZA BASICA");
        System.out.println("Numero de compra: " + ticket1.getNumeroCompra());
        System.out.println("Resumen: " + ticket1.getResumen());
        System.out.println("Monto total: " + ticket1.getMontoTotal());


        System.out.println("\n-----------------------------\n");


        // Creamos una balanza avanzada.
        Avanzada avanzada = new Avanzada();

        // Registramos los productos.
        avanzada.agregarProducto(p1);
        avanzada.agregarProducto(p2);

        // Finalizamos la compra.
        Ticket ticket2 = avanzada.finalizarCompra();

        System.out.println("BALANZA AVANZADA");
        System.out.println("Numero de compra: " + ticket2.getNumeroCompra());
        System.out.println("Resumen: " + ticket2.getResumen());
        System.out.println("Monto total: " + ticket2.getMontoTotal());
    }
}
