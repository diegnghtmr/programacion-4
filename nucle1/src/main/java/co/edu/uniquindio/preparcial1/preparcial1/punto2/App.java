import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ArrayList<String> prueba1 = new ArrayList<>(Arrays.asList("Hola", "Adios"));
        ArrayList<String> prueba2 = new ArrayList<>(Arrays.asList("Agua", "Adios"));

        System.out.println(unirListas(prueba1, prueba2));

        ArrayList<Boolean> prueba3 = new ArrayList<>(Arrays.asList(true));
        ArrayList<Boolean> prueba4 = new ArrayList<>(Arrays.asList(false));

        System.out.println(unirListas(prueba3, prueba4));
        
        

    }

    public static <T> LinkedList <T> unirListas(List<T> list1, List<T> list2) {
        HashSet<T> union = new HashSet<>();
        union.addAll(list1);
        union.addAll(list2);

        LinkedList<T> lista = new LinkedList<>(union);
        return lista;
    }


    
}








