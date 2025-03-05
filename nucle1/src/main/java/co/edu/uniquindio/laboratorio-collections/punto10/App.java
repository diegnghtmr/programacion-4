public class App {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();

        System.out.println("=== Sistema de Control de Acceso ===\n");

        System.out.println("Registrando empleados:");
        mostrarResultadoRegistro(control, "E001");
        mostrarResultadoRegistro(control, "E002");
        mostrarResultadoRegistro(control, "E003");
        
        System.out.println("\nIntentando registrar ID duplicado:");
        mostrarResultadoRegistro(control, "E001");

        System.out.println("\nVerificando acceso:");
        verificarAccesoEmpleado(control, "E001");
        verificarAccesoEmpleado(control, "E002");
        verificarAccesoEmpleado(control, "E004");

        System.out.println("\nTotal de empleados registrados: " + control.getCantidadEmpleados());
        control.mostrarEmpleadosRegistrados();
    }

    private static void mostrarResultadoRegistro(ControlAcceso control, String id) {
        boolean resultado = control.registrarEmpleado(id);
        System.out.println("Registro de ID " + id + ": " + 
            (resultado ? "Exitoso" : "Fallido - ID ya existe"));
    }

    private static void verificarAccesoEmpleado(ControlAcceso control, String id) {
        boolean tieneAcceso = control.verificarAcceso(id);
        System.out.println("Acceso para ID " + id + ": " + 
            (tieneAcceso ? "Autorizado" : "Denegado"));
    }
}
