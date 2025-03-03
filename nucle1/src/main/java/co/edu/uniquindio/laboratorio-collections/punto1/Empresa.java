import java.util.TreeSet;

public class Empresa {
    
    private TreeSet<Producto> productos;

    public Empresa(){
        productos = new TreeSet<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    } 

}
