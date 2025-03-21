public class ListaSimplementeEnlazada<T> {
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

    public void agregarFinal(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if(inicial == null) {
            inicial = nuevoNodo;
            tamanio++;
            return;
        } else if(inicial.getSiguiente() == null) {
            inicial.setSiguiente(nuevoNodo);
            tamanio++;
            return;
        }

        if(inicial.getSiguiente()  != null) {
            Nodo nodoRecorrer = inicial.getSiguiente();

            while(nodoRecorrer.getSiguiente() != null) {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }

            nodoRecorrer.setSiguiente(nuevoNodo);
            tamanio++;
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
                break;
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

    public String mostrar(){
        Nodo<T> nodoRecorrer = inicial;
        String cadena = "";

        while (nodoRecorrer != null) {
            if(nodoRecorrer.getSiguiente() != null) {
                cadena += nodoRecorrer.getDato() + " -> ";
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }else{
                cadena += nodoRecorrer.getDato();
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }

        return cadena;
    }
}
