import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class HistorialMensajes {
    private ArrayDeque<Mensaje> historial;
    private static final int MAX_MENSAJES = 10;

    public HistorialMensajes() {
        historial = new ArrayDeque<>(MAX_MENSAJES);
    }

    public void agregarMensaje(Mensaje mensaje) {
        if (historial.size() >= MAX_MENSAJES) {
            historial.removeFirst();
        }
        historial.addLast(mensaje);
    }

    public List<Mensaje> obtenerUltimosMensajes() {
        List<Mensaje> mensajes = new ArrayList<>(historial);
        return mensajes;
    }

    public int cantidadMensajes() {
        return historial.size();
    }

    public void mostrarHistorial() {
        System.out.println("\nÚltimos " + Math.min(MAX_MENSAJES, historial.size()) + " mensajes:");
        for (Mensaje mensaje : historial) {
            System.out.println(mensaje);
        }
    }
}
