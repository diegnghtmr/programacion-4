public class App {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.addProducto(new Producto("uwu","777a", 24.1));

        empresa.addProducto(new Producto("ewe","777c", 22.1));

        empresa.addProducto(new Producto("owo","777b", 20.1));

        Producto producto = empresa.buscarProducto("777c");
        if (producto != null) {
            System.out.println(producto.toString());
        } else
            System.out.println("No se encontro");
    }
}
