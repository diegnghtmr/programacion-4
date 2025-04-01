public class ListaSimplementeEnlazada<T extends Number> {
    private Nodo<T> inicial;
    private int tamanio;

    public ListaSimplementeEnlazada() {
        this.inicial = null;
        this.tamanio = 0;
    }

    public void agregarFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (inicial == null) {
            inicial = nuevo;
        } else {
            Nodo<T> actual = inicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public int getTamanio() {
        return tamanio;
    }

    public double sumarElementos() {
        double suma = 0.0;
        Nodo<T> actual = inicial;
        while (actual != null) {
            suma += actual.getDato().doubleValue();
            actual = actual.getSiguiente();
        }
        return suma;
    }

    public T obtenerValor(int index) {

        Nodo<T> actual = inicial;
        int contador = 0;
        while (contador < index) {
            actual = actual.getSiguiente();
            contador++;
        }
        return actual.getDato();
    }
}

