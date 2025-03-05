import java.util.TreeSet;

public class RegistroEstudiantes {
    private TreeSet<String> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new TreeSet<>();
    }

    public boolean agregarEstudiante(String nombre) {
        return estudiantes.add(nombre);
    }

    public boolean eliminarEstudiante(String nombre) {
        return estudiantes.remove(nombre);
    }

    public String obtenerPrimerEstudiante() {
        return estudiantes.isEmpty() ? null : estudiantes.first();
    }

    public String obtenerUltimoEstudiante() {
        return estudiantes.isEmpty() ? null : estudiantes.last();
    }

    public int cantidadEstudiantes() {
        return estudiantes.size();
    }

    public void mostrarEstudiantes() {
        System.out.println("\nLista de estudiantes (orden alfabético):");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
