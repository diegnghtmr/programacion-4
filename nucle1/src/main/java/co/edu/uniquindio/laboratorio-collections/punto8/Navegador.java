import java.util.ArrayDeque;

public class Navegador {
    private ArrayDeque<String> historial;

    public Navegador() {
        historial = new ArrayDeque<>();
    }

    public void navegar(String nombre) {
        historial.push(nombre);
        System.out.println("Navego a " + historial.peek());
    }

    public void retroceder() {
        historial.pop();
        System.out.println("Retorno a " + historial.peek());
    }

    public void mirarHistorial() {
        for (String pag : historial) {
            System.out.println(pag);
        }
    }
    
}
