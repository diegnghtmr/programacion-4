public class ListaCircularSimplementeEnlazada<T> {
    private Nodo<T> inicio;
    private Nodo<T> ultimo;
    private int tamanio;

    public ListaCircularSimplementeEnlazada() {
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    public void agregarInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.setSiguiente(inicio);
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
            ultimo.setSiguiente(inicio);
        }
        tamanio++;
    }

    public void agregarFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(inicio);
            ultimo = nuevoNodo;
        }
        tamanio++;
    }

    public void agregarAntes(T referencia, T dato) {
        if (inicio == null) return;
        if (inicio.getDato().equals(referencia)) {
            agregarInicio(dato);
            return;
        }
        Nodo<T> actual = inicio;
        while (actual.getSiguiente() != inicio) {
            if (actual.getSiguiente().getDato().equals(referencia)) {
                Nodo<T> nuevoNodo = new Nodo<>(dato);
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
                tamanio++;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public void agregarDespues(T referencia, T dato) {
        if (inicio == null) return;
        Nodo<T> actual = inicio;
        while (actual.getSiguiente() != inicio) {
            if (actual.getDato().equals(referencia)) {
                Nodo<T> nuevoNodo = new Nodo<>(dato);
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
                if (actual == ultimo) {
                    ultimo = nuevoNodo;
                }
                tamanio++;
                return;
            }
            actual = actual.getSiguiente();
        }
        if (actual.getDato().equals(referencia)) {
            Nodo<T> nuevoNodo = new Nodo<>(dato);
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
            tamanio++;
        }
    }

    public void eliminar(T dato) {
        if (inicio == null) return;
        if (inicio.getDato().equals(dato)) {
            if (inicio == ultimo) { 
                inicio = null;
                ultimo = null;
            } else {
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }
            tamanio--;
            return;
        }
        Nodo<T> actual = inicio;
        while (actual.getSiguiente() != inicio) {
            if (actual.getSiguiente().getDato().equals(dato)) {
                if (actual.getSiguiente() == ultimo) {
                    ultimo = actual;
                }
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamanio--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public boolean obtener(T dato) {
        if (inicio == null) return false;
        Nodo<T> actual = inicio;
        for (int i = 0; i < tamanio; i++) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int localizar(T dato) {
        if (inicio == null) return -1;
        Nodo<T> actual = inicio;
        for (int i = 0; i < tamanio; i++) {
            if (actual.getDato().equals(dato)) {
                return i;
            }
            actual = actual.getSiguiente();
        }
        return -1;
    }

    public String mostrar() {
        if (inicio == null) return "";
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = inicio;
        for (int i = 0; i < tamanio; i++) {
            sb.append(actual.getDato());
            if (i < tamanio - 1) {
                sb.append(" -> ");
            }
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    
}
