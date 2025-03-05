public class App {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        System.out.println("=== Sistema de Carrito de Compras ===");

        System.out.println("\nEscaneando productos:");

        Producto p1 = new Producto("001", "Leche", 3.50);
        Producto p2 = new Producto("002", "Pan", 2.00);
        Producto p3 = new Producto("003", "Huevos", 5.00);
        Producto p4 = new Producto("004", "Arroz", 4.50);

        carrito.agregarProducto(p1, 2);
        System.out.println("Agregado: " + p1 + " x2");

        carrito.agregarProducto(p2, 3);
        System.out.println("Agregado: " + p2 + " x3");

        carrito.agregarProducto(p3, 1);
        System.out.println("Agregado: " + p3 + " x1");

        carrito.agregarProducto(p4, 2);
        System.out.println("Agregado: " + p4 + " x2");

        carrito.mostrarCarrito();

        System.out.println("\nActualizando cantidad de Pan a 5 unidades");
        carrito.actualizarCantidad(p2, 5);

        System.out.println("\nEliminando Huevos del carrito");
        carrito.eliminarProducto(p3);

        System.out.println("\nCarrito actualizado:");
        carrito.mostrarCarrito();
    }
}
