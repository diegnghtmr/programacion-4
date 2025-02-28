import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    public static void main(String[] args) {
        Collections.reverse(list);
        System.out.println(list);
    }
    
}
