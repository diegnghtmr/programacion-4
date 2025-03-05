public class App {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        System.out.println("=== Sistema de Mensajería ===");

        agregarMensajeDePrueba(historial, "Juan", "¡Hola a todos!", "10:00");
        agregarMensajeDePrueba(historial, "María", "Hola Juan", "10:01");
        agregarMensajeDePrueba(historial, "Carlos", "¿Cómo están?", "10:02");
        agregarMensajeDePrueba(historial, "Ana", "Todo bien", "10:03");
        agregarMensajeDePrueba(historial, "Juan", "¿Reunión mañana?", "10:04");
        agregarMensajeDePrueba(historial, "María", "Sí, a las 9", "10:05");
        agregarMensajeDePrueba(historial, "Carlos", "Ahí estaré", "10:06");
        agregarMensajeDePrueba(historial, "Ana", "Yo también", "10:07");
        agregarMensajeDePrueba(historial, "Juan", "Perfecto", "10:08");
        agregarMensajeDePrueba(historial, "María", "Hasta mañana", "10:09");

        historial.mostrarHistorial();

        System.out.println("\nAgregando nuevo mensaje (debe eliminar el más antiguo):");
        agregarMensajeDePrueba(historial, "Carlos", "¡Nos vemos!", "10:10");

        historial.mostrarHistorial();
    }

    private static void agregarMensajeDePrueba(HistorialMensajes historial, 
            String remitente, String contenido, String timestamp) {
        historial.agregarMensaje(new Mensaje(remitente, contenido, timestamp));
    }
}
