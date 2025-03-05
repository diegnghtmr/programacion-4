import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    private HashMap<String, String> contactos;

    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }

    public boolean agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            return false;
        }
        contactos.put(nombre, telefono);
        return true;
    }

    public boolean actualizarTelefono(String nombre, String nuevoTelefono) {
        if (!contactos.containsKey(nombre)) {
            return false;
        }
        contactos.put(nombre, nuevoTelefono);
        return true;
    }

    public String buscarTelefono(String nombre) {
        return contactos.get(nombre);
    }

    public boolean eliminarContacto(String nombre) {
        return contactos.remove(nombre) != null;
    }

    public int cantidadContactos() {
        return contactos.size();
    }

    public void mostrarDirectorio() {
        System.out.println("\nDirectorio Telefónico:");
        for (Map.Entry<String, String> entrada : contactos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
