public class BigCola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public BigCola() {
        this.frente = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void encolarIzquierda(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(frente);
            frente.setAnterior(nuevo);
            frente = nuevo;
        }
        tamanio++;
    }

    public void encolarDerecha(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        tamanio++;
    }

    public void desencolarIzquierda() {
        if (estaVacia()) {
            throw new RuntimeException("La bicola está vacía");
        }
        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            frente = frente.getSiguiente();
            frente.setAnterior(null);
        }
        tamanio--;
    }

    public void desencolarDerecha() {
        if (estaVacia()) {
            throw new RuntimeException("La bicola está vacía");
        }
        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
        tamanio--;
    }

    public T peekIzquierda() {
        if (estaVacia()) {
            throw new RuntimeException("La bicola está vacía");
        }
        return frente.getDato();
    }

    public T peekDerecha() {
        if (estaVacia()) {
            throw new RuntimeException("La bicola está vacía");
        }
        return fin.getDato();
    }

    public void vaciar() {
        frente = null;
        fin = null;
        tamanio = 0;
    }
}

