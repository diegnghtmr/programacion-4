import java.util.*;

public class App {
    public static void main(String[] args) {
        Integer[] entero = {1,1,2};
        String[] cadena = {"xd","hola","adio", "xd"};
        System.out.println(contarO(entero, 1));
        System.out.println(contarO(cadena, "xd"));
    }

    public static<T> int contarO(T[] array, T element) {
        if (array == null) {
            return 0;
        }
        List<T> list = Arrays.asList(array);
        return Collections.frequency(list, element);
    }
    
}
