import java.util.*;

public class App {
    public static void main(String[] args) {
       Map<String, Integer> a = new HashMap<>();
       a.put("hola", 1);
       a.put("adio", 2);
       removeIfEven(a);
       System.out.println(a);
    }

    public static <K> void removeIfEven(Map<K, Integer> map) {
        Iterator<Map.Entry<K, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, Integer> entry = iterator.next();
            if (entry.getValue() % 2 == 0) {
                iterator.remove();
            }
            
        }
    }
    
}
