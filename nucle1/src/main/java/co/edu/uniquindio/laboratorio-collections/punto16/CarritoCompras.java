import java.util.LinkedHashMap;
import java.util.Map;

public class CarritoCompras {
    private LinkedHashMap<Producto, Integer> productos;

    public CarritoCompras() {
        productos = new LinkedHashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
    }

    public boolean eliminarProducto(Producto producto) {
        return productos.remove(producto) != null;
    }

    public void actualizarCantidad(Producto producto, int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            productos.remove(producto);
        } else {
            productos.put(producto, nuevaCantidad);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("\nProductos en el carrito (orden de escaneo):");
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            System.out.printf("%s x%d = $%.2f%n", 
                producto, cantidad, producto.getPrecio() * cantidad);
        }
        System.out.printf("\nTotal de la compra: $%.2f%n", calcularTotal());
    }
}
