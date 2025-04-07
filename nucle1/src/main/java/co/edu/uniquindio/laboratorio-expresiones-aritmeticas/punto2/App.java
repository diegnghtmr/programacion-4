import java.util.*;
public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        Pila<Integer> pila = new Pila<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(101);
            lista.agregarFinal(num);
        }

        Nodo<Integer> nodoRecorrer = lista.getInicial();

        while(nodoRecorrer != null) {
            pila.apilar(nodoRecorrer.getDato());
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }

        System.out.println(lista.mostrar());

        while (!pila.estaVacia()){
            System.out.print(pila.desapilar() + " ");
        }



    }
}
