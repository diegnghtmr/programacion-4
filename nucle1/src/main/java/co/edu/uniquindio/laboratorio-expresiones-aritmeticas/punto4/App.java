public class App {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        Cola<Integer> cola = new Cola<>();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        while(!pila.estaVacia()){
            cola.encolar(pila.desapilar());
        }

        while(!cola.estaVacia()) {
            System.out.print(cola.peek() + " ");
            cola.desencolar();
        }

        
    }
}
