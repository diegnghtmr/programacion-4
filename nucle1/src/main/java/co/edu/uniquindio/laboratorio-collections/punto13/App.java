public class App {
    public static void main(String[] args) {
        SalaEmergencias sala = new SalaEmergencias();

        System.out.println("=== Sistema de Sala de Emergencias ===");

        System.out.println("\nRegistrando pacientes:");
        sala.agregarPaciente("Juan Pérez", 2, "Dolor de cabeza");
        System.out.println("Agregado: Juan Pérez - Urgencia 2");
        
        sala.agregarPaciente("María García", 5, "Fractura expuesta");
        System.out.println("Agregado: María García - Urgencia 5");
        
        sala.agregarPaciente("Carlos López", 3, "Fiebre alta");
        System.out.println("Agregado: Carlos López - Urgencia 3");
        
        sala.agregarPaciente("Ana Martínez", 4, "Crisis asmática");
        System.out.println("Agregado: Ana Martínez - Urgencia 4");

        sala.mostrarColaPacientes();

        System.out.println("\nAtendiendo pacientes:");
        for (int i = 0; i < 2; i++) {
            Paciente paciente = sala.atenderSiguientePaciente();
            if (paciente != null) {
                System.out.println("Atendiendo a: " + paciente);
            }
        }

        System.out.println("\nPacientes restantes en espera: " + sala.cantidadPacientes());
        sala.mostrarColaPacientes();
    }
}
