import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio7 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,7,3,9));
    public static void main(String[] args) {
        Collections.sort(list);
        int max = Collections.max(list);
        int indexMax = list.indexOf(max);
        list.remove(indexMax);
        int secondMax = Collections.max(list);
        System.out.println(secondMax);
    }

}
