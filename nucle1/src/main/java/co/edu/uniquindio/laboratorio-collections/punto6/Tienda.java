import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tienda {
    private List<Producto> listaproductos;
    public Tienda() {
        listaproductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaproductos.add(producto);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : listaproductos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        } return null;
    }

    public void eliminarProductoAgotado(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            if (producto.getCantidad() <=0) {
                listaproductos.remove(producto);
                System.out.println("producto eliminado");
            } else {
                System.out.println("el producto tiene stock");
            }
        } else {
            System.out.println("el producto no fue encontrado para eliminar");
        }
    }

    public void listarProductos() {
       Collections.sort(listaproductos);
       for (Producto producto : listaproductos) {
           System.out.println(producto);
       }
   }
    
}
