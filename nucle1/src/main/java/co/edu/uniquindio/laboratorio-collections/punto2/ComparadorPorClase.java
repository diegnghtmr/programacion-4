import java.util.Comparator;

public class ComparadorPorClase<T> implements Comparator<T>{

    public ComparadorPorClase() {

    }

    @Override
    public int compare(T object1, T object2) {
        return object1.getClass().getName().compareTo(object2.getClass().getName());
    }
    
}
