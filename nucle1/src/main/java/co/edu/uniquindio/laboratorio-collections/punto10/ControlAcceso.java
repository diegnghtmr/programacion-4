import java.util.HashSet;

public class ControlAcceso {
    private HashSet<String> idsEmpleados;

    public ControlAcceso() {
        idsEmpleados = new HashSet<>();
    }

    public boolean registrarEmpleado(String id) {
        return idsEmpleados.add(id);
    }

    public boolean verificarAcceso(String id) {
        return idsEmpleados.contains(id);
    }

    public boolean eliminarEmpleado(String id) {
        return idsEmpleados.remove(id);
    }

    public int getCantidadEmpleados() {
        return idsEmpleados.size();
    }

    public void mostrarEmpleadosRegistrados() {
        System.out.println("\nEmpleados registrados:");
        for (String id : idsEmpleados) {
            System.out.println("ID: " + id);
        }
    }
}
