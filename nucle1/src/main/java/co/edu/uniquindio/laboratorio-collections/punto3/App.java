import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;


public class App {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();

        list.add("manzana");
        list.add("cebollin");
        list.add("platano");
        list.add("manzana");

        Iterator<String> iterador = list.iterator();
        

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

    }
    
}
