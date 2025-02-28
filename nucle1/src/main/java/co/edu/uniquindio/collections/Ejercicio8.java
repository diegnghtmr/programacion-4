import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {
    
    private static List<String> list = new ArrayList<>(Arrays.asList(
                "casa", "perro", "juventud", "callcenter", "tristeza", "avion"));

    public static void main(String[] args) {
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
