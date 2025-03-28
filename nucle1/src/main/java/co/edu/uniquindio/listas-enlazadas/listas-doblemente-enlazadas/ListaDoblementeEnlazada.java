public class ListaDoblementeEnlazada<T> {
    private NodoDoble<T> inicio;
    private NodoDoble<T> ultimo;
    private int tamanio;

    public ListaDoblementeEnlazada() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.inicio == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void agregarInicio(T dato) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(dato);
        if (estaVacia()) {
            this.inicio = nuevoNodo;
            this.ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.inicio); 
            this.inicio.setAnterior(nuevoNodo); 
            this.inicio = nuevoNodo;            
        }
        this.tamanio++;
    }

    public void agregarFinal(T dato) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(dato);
        if (estaVacia()) {
            this.inicio = nuevoNodo;
            this.ultimo = nuevoNodo;
        } else {
            this.ultimo.setSiguiente(nuevoNodo); 
            nuevoNodo.setAnterior(this.ultimo);  
            this.ultimo = nuevoNodo;             
        }
        this.tamanio++;
    }

    public boolean eliminar(T dato) {
        if (estaVacia()) {
            return false;
        }

        NodoDoble<T> actual = this.inicio;

        while (actual != null && !actual.getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            return false;
        }

        if (actual == this.inicio && actual == this.ultimo) {
            this.inicio = null;
            this.ultimo = null;
        }
        else if (actual == this.inicio) {
            this.inicio = this.inicio.getSiguiente(); 
            this.inicio.setAnterior(null);            
        }
        else if (actual == this.ultimo) {
            this.ultimo = this.ultimo.getAnterior();
            this.ultimo.setSiguiente(null);
        }
        else {
            NodoDoble<T> nodoAnterior = actual.getAnterior();
            NodoDoble<T> nodoSiguiente = actual.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);
        }

        this.tamanio--;
        return true;
    }

    public boolean obtener(T dato) {
         if (estaVacia()) {
            return false;
        }
        NodoDoble<T> actual = this.inicio;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int localizar(T dato) {
        if (estaVacia()) {
            return -1;
        }
        NodoDoble<T> actual = this.inicio;
        int indice = 0;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return indice;
            }
            actual = actual.getSiguiente();
            indice++;
        }
        return -1; // No encontrado
    }


    public String mostrarAdelante() {
        if (estaVacia()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        NodoDoble<T> actual = this.inicio;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(" <-> ");
            }
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }

    public String mostrarAtras() {
        if (estaVacia()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        NodoDoble<T> actual = this.ultimo;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getAnterior() != null) {
                sb.append(" <-> "); 
            }
            actual = actual.getAnterior();
        }
        sb.append("]");
        return sb.toString();
    }
}
