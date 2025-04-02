public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;
    private int tamanio;

    public Cola() {
        this.frente = null;
        this.finalCola = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevo;
            finalCola = nuevo;
        } else {
            finalCola.setSiguiente(nuevo);
            finalCola = nuevo;
        }
        tamanio++;
    }

    public void desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        frente = frente.getSiguiente();
        if (frente == null) { 
            finalCola = null;
        }
        tamanio--;
    }

    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return frente.getDato();
    }

    public void vaciar() {
        frente = null;
        finalCola = null;
        tamanio = 0;
    }
}

