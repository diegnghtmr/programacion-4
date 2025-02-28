import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio9 {
    
    private static List<String> list = new ArrayList<>(Arrays.asList("ayuda", "odio", "backtracking", "odio"));
    private static List<String> list2 = new ArrayList<>(Arrays.asList("casa", "manolito", "javagod"));

    public static void main(String[] args) {
        int value = Collections.frequency(list, "odio");
        System.out.println(value);

        if (Collections.disjoint(list, list2)) {
            System.out.println("Son completamente diferentes");
        } else {
            System.out.println("Tienen valores iguales");
        }
    }
    
}
