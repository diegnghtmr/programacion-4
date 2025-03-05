import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("=== Agenda de Eventos ===");

        LocalDateTime fecha1 = LocalDateTime.of(2024, 3, 15, 10, 0);
        LocalDateTime fecha2 = LocalDateTime.of(2024, 3, 10, 15, 30);
        LocalDateTime fecha3 = LocalDateTime.of(2024, 3, 20, 9, 0);

        System.out.println("\nAgregando eventos:");

        agregarEvento(agenda, fecha1, new Evento(
            "Reunión Directiva",
            "Revisión de objetivos trimestrales",
            "Sala de Juntas"
        ));

        agregarEvento(agenda, fecha2, new Evento(
            "Presentación Proyecto",
            "Demostración nuevo software",
            "Auditorio"
        ));

        agregarEvento(agenda, fecha3, new Evento(
            "Capacitación",
            "Nuevas tecnologías",
            "Sala de Conferencias"
        ));

        agenda.mostrarEventos();
        agenda.mostrarProximoEvento();

        System.out.println("\nIntentando agregar evento en fecha ocupada:");
        agregarEvento(agenda, fecha1, new Evento(
            "Otro Evento",
            "Este evento no debería agregarse",
            "Sala B"
        ));

        System.out.println("\nEliminando evento del 15/03/2024:");
        if (agenda.eliminarEvento(fecha1)) {
            System.out.println("Evento eliminado exitosamente");
        }

        System.out.println("\nAgenda actualizada:");
        agenda.mostrarEventos();
    }

    private static void agregarEvento(AgendaEventos agenda, LocalDateTime fecha, Evento evento) {
        boolean resultado = agenda.agregarEvento(fecha, evento);
        System.out.println("Agregando evento para " + 
            fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + ": " +
            (resultado ? "Exitoso" : "Fallido - Fecha ocupada"));
    }
}
