import java.util.*;
public class Pair<K extends Comparable<K>, V> {
    private K clave;
    private V valor;

    public Pair(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public K compararClaveM(Pair<K, ?> otro) {
        if (otro == null) {
            return this.clave;
        }

        if (this.clave.compareTo(otro.clave) > 0) {
            return this.clave;
        } else if (this.clave.compareTo(otro.clave) < 0) {
            return otro.clave;
        } else {
            return this.clave;
        }

    }

    
}
