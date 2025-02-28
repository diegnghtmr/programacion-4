import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
    public static void main(String[] args) {
        Collections.fill(list, 6);
        System.out.println(list);
    }
    
}
