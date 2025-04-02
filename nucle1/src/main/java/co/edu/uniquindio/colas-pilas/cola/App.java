public class App {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Frente de la cola: " + cola.peek());
        System.out.println("Tamaño de la cola: " + cola.getTamanio());

        cola.desencolar();
        System.out.println("Después de desencolar:");
        System.out.println("Frente de la cola: " + cola.peek());
        System.out.println("Tamaño de la cola: " + cola.getTamanio());

        while (!cola.estaVacia()) {
            System.out.println("Desencolando: " + cola.peek());
            cola.desencolar();
        }
        System.out.println("Tamaño final de la cola: " + cola.getTamanio());
    }
}

