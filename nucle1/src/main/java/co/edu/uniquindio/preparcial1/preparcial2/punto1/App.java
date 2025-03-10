import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("hola", "adio"));
        LinkedList<Double> lista2 = new LinkedList<>(Arrays.asList(1.2,3.4));
        ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(invertir(lista1));
        System.out.println(invertir(lista2));
        System.out.println(invertir(lista3));
    }

    public static <T> List<T> invertir(List<T> list) {
        Collections.reverse(list);

        return list;
    }

}

