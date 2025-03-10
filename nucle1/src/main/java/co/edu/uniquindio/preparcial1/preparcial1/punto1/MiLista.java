import java.util.Iterator;

public class MiLista implements Iterable<String> {
    private String[] arreglo;

    public MiLista(String[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public Iterator<String> iterator() {
        return new IteradorPosicionesPares(arreglo);
    }
    
    
}
