import java.util.*;

public class App {
    public static void main(String[] args) {
       List<String> a = new ArrayList<>(Arrays.asList("hola", "adio","adio","hola","sara"));
       System.out.println(transformar(a));
    }

    public static <T> Map<T, Integer> transformar(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        if (list == null) {
            return map;
        }
        Integer valor = 0;
        for (T t : list) {
            valor = Collections.frequency(list, t);
            map.put(t, valor);
        }
        return map;
    }
    
}
