import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<>(Arrays.asList("casa", "agua"));
        System.out.println(compararElementos(lista1));
        ArrayList<Double> lista2 = new ArrayList<>(Arrays.asList(1.2,1.02));
        System.out.println(compararElementos(lista2));
    }

    public static <T extends Comparable<T>> T compararElementos(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        } 
        
        return Collections.max(lista);
        
    } 

    
}
