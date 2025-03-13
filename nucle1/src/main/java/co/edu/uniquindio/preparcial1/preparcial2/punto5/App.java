import java.util.*;

public class App {
    public static void main(String[] args) {
       Set<Integer> a = new HashSet<>(Arrays.asList(1,2)); 
       Set<Integer> b = new HashSet<>(Arrays.asList(3,2)); 
       System.out.println(intersectar(a, b));

       Set<String> c = new HashSet<>(Arrays.asList("hola","adio"));
       Set<String> d = new HashSet<>(Arrays.asList("adio","sara"));
       System.out.println(intersectar(c, d));
    }

    public static <T> Set<T> intersectar(Set<T> l1, Set<T> l2) {
        if ( l1 == null || l2 == null) {
            throw new IllegalArgumentException("Los conjuntos deben tener datos");
        }

        Set<T> l = new HashSet<>(l1);
        l.retainAll(l2);
        return l;
    } 
    
}
