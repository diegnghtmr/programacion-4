public class App {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        System.out.println("=== Prueba del Editor de Texto ===");
        
        editor.realizarCambio("Primer texto");
        System.out.println("Texto actual: " + editor.getTextoActual());
        
        editor.realizarCambio("Segundo texto");
        System.out.println("Texto actual: " + editor.getTextoActual());
        
        editor.realizarCambio("Tercer texto");
        System.out.println("Texto actual: " + editor.getTextoActual());

        System.out.println("\n=== Deshaciendo cambios ===");
        
        if (editor.deshacer()) {
            System.out.println("Deshacer #1 - Texto actual: " + editor.getTextoActual());
        }
        
        if (editor.deshacer()) {
            System.out.println("Deshacer #2 - Texto actual: " + editor.getTextoActual());
        }

        System.out.println("\nCambios en el historial: " + editor.getCantidadCambios());
    }
}
