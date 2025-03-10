import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("hola", "adio"));
        LinkedList<Double> lista2 = new LinkedList<>(Arrays.asList(2.3, 5.7));
        System.out.println(invertirLista(lista1));
        System.out.println(invertirLista(lista2));
    }

    public static <T> List<T> invertirLista(List<T> list) {
        List<T> newList = new ArrayList<>(list);
        Collections.reverse(newList);
        return newList;
    }

}
