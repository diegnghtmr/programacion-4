import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorPosicionesPares implements Iterator<String> {
    private int posicionActual;
    private String[] arreglo;

    public IteradorPosicionesPares(String[] arreglo) {
        posicionActual = 0;
        this.arreglo = arreglo;
    }

    @Override
    public boolean hasNext() {
        return posicionActual < arreglo.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("NO hay mas elementos :c");
        }
        String elemento = arreglo[posicionActual];
        posicionActual += 2;
        return elemento;
    }

    
    
}
