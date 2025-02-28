import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio5 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

    public static void main(String[] args) {
        int min = Collections.min(list);
        System.out.println(min);
        int max = Collections.max(list);
        System.out.println(max);
    }
    
}
