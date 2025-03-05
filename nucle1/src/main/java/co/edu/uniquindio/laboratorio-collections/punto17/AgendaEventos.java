import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<LocalDateTime, Evento> eventos;
    private static final DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    public boolean agregarEvento(LocalDateTime fecha, Evento evento) {
        if (eventos.containsKey(fecha)) {
            return false;
        }
        eventos.put(fecha, evento);
        return true;
    }

    public boolean eliminarEvento(LocalDateTime fecha) {
        return eventos.remove(fecha) != null;
    }

    public Evento buscarEvento(LocalDateTime fecha) {
        return eventos.get(fecha);
    }

    public Map.Entry<LocalDateTime, Evento> obtenerProximoEvento() {
        return eventos.firstEntry();
    }

    public int cantidadEventos() {
        return eventos.size();
    }

    public void mostrarEventos() {
        System.out.println("\nEventos programados (orden cronológico):");
        for (Map.Entry<LocalDateTime, Evento> entry : eventos.entrySet()) {
            System.out.println(formatter.format(entry.getKey()) + " - " + entry.getValue());
        }
    }

    public void mostrarProximoEvento() {
        Map.Entry<LocalDateTime, Evento> proximo = obtenerProximoEvento();
        if (proximo != null) {
            System.out.println("\nPróximo evento:");
            System.out.println(formatter.format(proximo.getKey()) + " - " + proximo.getValue());
        } else {
            System.out.println("\nNo hay eventos programados");
        }
    }
}
