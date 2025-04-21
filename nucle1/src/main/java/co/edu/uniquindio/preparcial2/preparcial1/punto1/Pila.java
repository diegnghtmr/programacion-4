public class Pila<T> {
    private Nodo<T> tope;  
    private int tamanio;  

    public Pila() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void apilar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
        tamanio++;
    }

    public T desapilar() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        T dato = tope.getDato();
        tope = tope.getSiguiente();
        tamanio--;
        return dato;
    }

    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return tope.getDato();
    }

    public void vaciar() {
        tope = null;
        tamanio = 0;
    }
}

