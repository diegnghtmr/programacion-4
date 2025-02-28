import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Ejercicio1 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,7,3,5,9,2));

    public static void main(String[] args) {
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, 5);
        System.out.println(index);
    }
    
}
