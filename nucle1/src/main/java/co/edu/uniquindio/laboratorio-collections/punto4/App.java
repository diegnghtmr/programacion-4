import java.util.PriorityQueue;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Tarea> cola = new PriorityQueue<>();

        cola.add(new Tarea("Calculo", 5));

        cola.add(new Tarea("Programacion", 3));

        cola.add(new Tarea("Grafos", 8));

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
             
        }
    }
}
