public class ListaSimplementeEnlazada<T extends Comparable<T>> {
    private Nodo inicial;
    private int tamanio;

    public ListaSimplementeEnlazada() {
        inicial = null;
        tamanio = 0;
    }

    public void agregarInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        nuevoNodo.setSiguiente(inicial);
        inicial = nuevoNodo;
        tamanio++;
    }

    public void agregarFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (inicial == null) {
            inicial = nuevoNodo;
        } else {
            Nodo<T> nodoRecorrer = inicial;
            while (nodoRecorrer.getSiguiente() != null) {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
            nodoRecorrer.setSiguiente(nuevoNodo);
        }
        tamanio++;
    }

    public void agregarAntes(T referencia, T dato) {
        if (inicial == null) return; 
        if (inicial.getDato().equals(referencia)) {
            agregarInicio(dato);
            return;
        }

        Nodo<T> actual = inicial;
        while (actual.getSiguiente() != null) {
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
        if (inicial == null) return;

        Nodo<T> actual = inicial;
        while (actual != null) {
            if (actual.getDato().equals(referencia)) {
                Nodo<T> nuevoNodo = new Nodo<>(dato);
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
                tamanio++;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminar(T dato){
        if(inicial == null) return;

        if(inicial.getDato().equals(dato) && inicial.getSiguiente() == null) {
            inicial = null;
            tamanio--;
            return;
        } else if(inicial.getDato().equals(dato)) {
            inicial = inicial.getSiguiente();
            tamanio--;
            return;
        }

        Nodo nodoRecorrer = inicial;

        while(nodoRecorrer.getSiguiente() != null) {
            if(nodoRecorrer.getSiguiente().getDato().equals(dato)){
                nodoRecorrer.setSiguiente(nodoRecorrer.getSiguiente().getSiguiente());
                tamanio--;
                return;
            }else {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }
    }

    public boolean obtener(T dato){
        Nodo<T> recorrerNodo = inicial;

        while(recorrerNodo != null) {
            if(recorrerNodo.getDato().equals(dato)){
                return true;
            }else {
                recorrerNodo = recorrerNodo.getSiguiente();
            }
        }

        return false;
    }

    public int localizar(T dato){
        Nodo<T> recorrerNodo = inicial;
        int contador = 0;

        while(recorrerNodo != null) {
            if(recorrerNodo.getDato().equals(dato)){
                return contador;
            }else{
                recorrerNodo = recorrerNodo.getSiguiente();
                contador++;
            }
        }

        return -1;
    }

    public void ordenar() {
        if (inicial == null || inicial.getSiguiente() == null) {
            return;
        }

        boolean cambio;
        Nodo<T> nodoFinal = null;

        do {
            cambio = false;
            Nodo<T> actual = inicial;
            
            while (actual.getSiguiente() != nodoFinal) {
                Nodo<T> siguiente = actual.getSiguiente();

                if (actual.getDato().compareTo(siguiente.getDato()) > 0) {
                    T temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    cambio = true;
                }
                actual = actual.getSiguiente();
            }
            nodoFinal = actual;
        }
        while (cambio);
    }

    public String mostrar() {
        Nodo<T> nodoRecorrer = inicial;
        StringBuilder cadena = new StringBuilder();

        while (nodoRecorrer != null) {
            cadena.append(nodoRecorrer.getDato());
            if (nodoRecorrer.getSiguiente() != null) {
                cadena.append(" -> ");
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }

        return cadena.toString();
    }

    public void eliminarNumerosPares() {
        if (inicial == null) return;
        while ((Integer)inicial.getDato()%2 == 0) {
            inicial = inicial.getSiguiente();
            tamanio--;
        }

        Nodo<T> recorrerNodo = inicial;
        while (recorrerNodo.getSiguiente() != null) {
            if ((Integer)recorrerNodo.getSiguiente().getDato()%2 == 0) {
                recorrerNodo.setSiguiente(recorrerNodo.getSiguiente().getSiguiente());
                tamanio--;
            } else {
                recorrerNodo = recorrerNodo.getSiguiente();
            }
        }
    }

}
