import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio4 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
    public static void main(String[] args) {
        List<Integer> listCopy = new ArrayList<>(list);
        System.out.println(listCopy);
        Collections.copy(list, listCopy);
        System.out.println(listCopy);
    }
    
}
