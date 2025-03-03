import java.util.LinkedList;

public class Banco {
    private LinkedList<String> colaClientes;

    public Banco() {
        colaClientes = new LinkedList<>();
    }
    
    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    public void agregarClientePrioridad(String cliente) {
        colaClientes.addFirst(cliente);
        System.out.println("Cliente prioritario agregado: " + cliente);
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            System.out.println(colaClientes.getFirst() + " despachado");
            colaClientes.removeFirst();
        } else {
            System.out.println("No hay clientes");
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "colaClientes=" + colaClientes +
                '}';
    }
}
