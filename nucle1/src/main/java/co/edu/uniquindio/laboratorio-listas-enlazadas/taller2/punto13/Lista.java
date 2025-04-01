public class Lista {
    NodoLista inicio = null;

    public void agregarFinal(int valor) {
        NodoLista nuevo = new NodoLista(valor);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoLista aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
    }

    public int maximaDistancia(int clave) {
        return maximaDistanciaRec(inicio, clave, 0, 0);
    }

    private int maximaDistanciaRec(NodoLista nodo, int clave, int distancia, int maximaDist) {
        if (nodo == null) {
            return maximaDist;
        }

        if (nodo.clave == clave) {
            if (distancia != 0) {
                if (distancia > maximaDist) {
                    maximaDist = distancia;
                }
            }
            distancia = 1;
        } else {
            if (distancia != 0) {
                distancia++;
            }
        }

        return maximaDistanciaRec(nodo.sig, clave, distancia, maximaDist);
    }
}
