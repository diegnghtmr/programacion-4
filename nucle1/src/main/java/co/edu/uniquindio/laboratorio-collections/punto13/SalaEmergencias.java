import java.util.PriorityQueue;

public class SalaEmergencias {
    private PriorityQueue<Paciente> colaAtencion;

    public SalaEmergencias() {
        colaAtencion = new PriorityQueue<>();
    }

    public void agregarPaciente(String nombre, int nivelUrgencia, String condicion) {
        Paciente paciente = new Paciente(nombre, nivelUrgencia, condicion);
        colaAtencion.offer(paciente);
    }

    public Paciente atenderSiguientePaciente() {
        return colaAtencion.poll();
    }

    public Paciente verSiguientePaciente() {
        return colaAtencion.peek();
    }

    public int cantidadPacientes() {
        return colaAtencion.size();
    }

    public void mostrarColaPacientes() {
        PriorityQueue<Paciente> colaTemp = new PriorityQueue<>(colaAtencion);
        System.out.println("\nPacientes en espera (ordenados por urgencia):");
        while (!colaTemp.isEmpty()) {
            System.out.println(colaTemp.poll());
        }
    }
}
