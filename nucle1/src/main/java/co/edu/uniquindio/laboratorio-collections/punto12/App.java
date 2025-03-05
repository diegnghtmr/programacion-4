public class App {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        System.out.println("\nAgregando estudiantes:");
        mostrarResultadoRegistro(registro, "Carlos Martínez");
        mostrarResultadoRegistro(registro, "Ana López");
        mostrarResultadoRegistro(registro, "Zulema Rodríguez");
        mostrarResultadoRegistro(registro, "Daniel Pérez");
        
        System.out.println("\nIntentando agregar estudiante duplicado:");
        mostrarResultadoRegistro(registro, "Ana López");

        registro.mostrarEstudiantes();

        System.out.println("\nPrimer estudiante (alfabéticamente): " + registro.obtenerPrimerEstudiante());
        System.out.println("Último estudiante (alfabéticamente): " + registro.obtenerUltimoEstudiante());
        
        System.out.println("\nTotal de estudiantes registrados: " + registro.cantidadEstudiantes());
    }

    private static void mostrarResultadoRegistro(RegistroEstudiantes registro, String nombre) {
        boolean resultado = registro.agregarEstudiante(nombre);
        System.out.println("Registrando: " + nombre + " - " + 
            (resultado ? "Exitoso" : "Fallido - Estudiante ya existe"));
    }
}
