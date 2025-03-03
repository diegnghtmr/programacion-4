public class App {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.agregarProducto(new Producto("P001", "Laptop", 1200.0, 5));
        tienda.agregarProducto(new Producto("P002", "Mouse", 25.0, 11));
        tienda.agregarProducto(new Producto("P003", "Teclado", 50.0, 0));

        tienda.listarProductos();

        System.out.println(tienda.buscarProducto("P001"));
        
        System.out.println(tienda.buscarProducto("P009"));
        
        tienda.eliminarProductoAgotado("P001");
        tienda.eliminarProductoAgotado("P003");

    }
    
}
