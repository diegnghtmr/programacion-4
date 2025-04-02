public class App {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        System.out.println("Elemento en el tope: " + pila.peek());
        System.out.println("Tamaño de la pila: " + pila.getTamanio());

        System.out.println("Desapilado: " + pila.desapilar());
        System.out.println("Elemento en el tope: " + pila.peek());
        System.out.println("Tamaño de la pila: " + pila.getTamanio());

        while (!pila.estaVacia()) {
            System.out.println("Desapilando: " + pila.desapilar());
        }
        System.out.println("Tamaño final de la pila: " + pila.getTamanio());
    }
}

