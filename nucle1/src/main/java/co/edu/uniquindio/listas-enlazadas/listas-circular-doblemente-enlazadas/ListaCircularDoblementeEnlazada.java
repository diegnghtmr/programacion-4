public class ListaCircularDoblementeEnlazada<T> {
    private NodoDoble<T> inicio;
    private NodoDoble<T> ultimo;
    private int tamanio;

    public ListaCircularDoblementeEnlazada() {
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
            this.inicio.setSiguiente(this.inicio);
            this.inicio.setAnterior(this.inicio);
        } else {
            nuevoNodo.setSiguiente(this.inicio); 
            nuevoNodo.setAnterior(this.ultimo);  
            this.inicio.setAnterior(nuevoNodo); 
            this.ultimo.setSiguiente(nuevoNodo); 
            this.inicio = nuevoNodo;            
        }
        this.tamanio++;
    }

    public void agregarFinal(T dato) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(dato);
        if (estaVacia()) {
            this.inicio = nuevoNodo;
            this.ultimo = nuevoNodo;
            this.inicio.setSiguiente(this.inicio);
            this.inicio.setAnterior(this.inicio);
        } else {
            nuevoNodo.setSiguiente(this.inicio);
            nuevoNodo.setAnterior(this.ultimo);  
            this.ultimo.setSiguiente(nuevoNodo); 
            this.inicio.setAnterior(nuevoNodo);  
            this.ultimo = nuevoNodo;            
        }
        this.tamanio++;
    }

    public boolean eliminar(T dato) {
        if (estaVacia()) {
            return false;
        }

        NodoDoble<T> nodoAEliminar = null;
        NodoDoble<T> actual = this.inicio;

        for (int i = 0; i < this.tamanio; i++) {
            if (actual.getDato().equals(dato)) {
                nodoAEliminar = actual;
                break;
            }
            actual = actual.getSiguiente();
        }

        if (nodoAEliminar == null) {
            return false;
        }

        if (this.tamanio == 1) {
            this.inicio = null;
            this.ultimo = null;
        }
        else if (nodoAEliminar == this.inicio) {
            this.inicio = this.inicio.getSiguiente();
            this.inicio.setAnterior(this.ultimo);     
            this.ultimo.setSiguiente(this.inicio);   
        }
        else if (nodoAEliminar == this.ultimo) {
            this.ultimo = this.ultimo.getAnterior();
            this.ultimo.setSiguiente(this.inicio);   
            this.inicio.setAnterior(this.ultimo);   
        }
        else {
            NodoDoble<T> nodoAnterior = nodoAEliminar.getAnterior();
            NodoDoble<T> nodoSiguiente = nodoAEliminar.getSiguiente();
            nodoAnterior.setSiguiente(nodoSiguiente); 
            nodoSiguiente.setAnterior(nodoAnterior); 
        }

        nodoAEliminar.setAnterior(null);
        nodoAEliminar.setSiguiente(null);

        this.tamanio--;
        return true;
    }

     public boolean obtener(T dato) {
         if (estaVacia()) {
            return false;
        }
        NodoDoble<T> actual = this.inicio;
        for (int i = 0; i < this.tamanio; i++) {
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
        for (int i = 0; i < this.tamanio; i++) {
            if (actual.getDato().equals(dato)) {
                return i;
            }
            actual = actual.getSiguiente();
            i++;
        }
        return -1; 
    }

    public String mostrarAdelante() {
        if (estaVacia()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        NodoDoble<T> actual = this.inicio;
        for (int i = 0; i < this.tamanio; i++) {
            sb.append(actual.getDato());
            if (i < this.tamanio - 1) {
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
         for (int i = 0; i < this.tamanio; i++) {
            sb.append(actual.getDato());
            if (i < this.tamanio - 1) {
                sb.append(" <-> "); 
            }
            actual = actual.getAnterior();
        }
        sb.append("]");
        return sb.toString();
    }
}
