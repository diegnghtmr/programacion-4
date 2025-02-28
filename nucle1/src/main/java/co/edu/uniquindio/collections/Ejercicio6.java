import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio6 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
    private static List<Integer> list1 = new ArrayList<>(Arrays.asList(7,8));


    public static void main(String[] args) {
        Collections.addAll(list, 1,2,3,4);
        System.out.println(list);
        boolean isCommon = Collections.disjoint(list, list1); 
        System.out.println(isCommon);
    }
}
