public class App {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        System.out.println("=== Directorio Telefónico ===");

        System.out.println("\nAgregando contactos:");
        mostrarResultadoAgregar(directorio, "Juan Pérez", "315-123-4567");
        mostrarResultadoAgregar(directorio, "María López", "320-987-6543");
        mostrarResultadoAgregar(directorio, "Carlos Ruiz", "310-555-1234");

        directorio.mostrarDirectorio();

        System.out.println("\nBuscando teléfonos:");
        buscarYMostrar(directorio, "María López");
        buscarYMostrar(directorio, "Pedro González");

        System.out.println("\nActualizando teléfono:");
        mostrarResultadoActualizar(directorio, "Juan Pérez", "315-999-8888");

        System.out.println("\nIntentando agregar contacto existente:");
        mostrarResultadoAgregar(directorio, "Juan Pérez", "315-777-6666");

        System.out.println("\nEliminando contacto:");
        mostrarResultadoEliminar(directorio, "Carlos Ruiz");

        System.out.println("\nDirectorio actualizado:");
        directorio.mostrarDirectorio();
    }

    private static void mostrarResultadoAgregar(DirectorioTelefonico directorio, 
            String nombre, String telefono) {
        boolean resultado = directorio.agregarContacto(nombre, telefono);
        System.out.println("Agregando " + nombre + ": " + 
            (resultado ? "Exitoso" : "Fallido - Contacto ya existe"));
    }

    private static void buscarYMostrar(DirectorioTelefonico directorio, String nombre) {
        String telefono = directorio.buscarTelefono(nombre);
        System.out.println("Teléfono de " + nombre + ": " + 
            (telefono != null ? telefono : "No encontrado"));
    }

    private static void mostrarResultadoActualizar(DirectorioTelefonico directorio, 
            String nombre, String nuevoTelefono) {
        boolean resultado = directorio.actualizarTelefono(nombre, nuevoTelefono);
        System.out.println("Actualizando teléfono de " + nombre + ": " + 
            (resultado ? "Exitoso" : "Fallido - Contacto no existe"));
    }

    private static void mostrarResultadoEliminar(DirectorioTelefonico directorio, String nombre) {
        boolean resultado = directorio.eliminarContacto(nombre);
        System.out.println("Eliminando " + nombre + ": " + 
            (resultado ? "Exitoso" : "Fallido - Contacto no existe"));
    }
}
