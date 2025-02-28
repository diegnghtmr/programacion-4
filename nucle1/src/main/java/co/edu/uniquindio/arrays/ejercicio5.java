import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio5 {
    private static Integer[] array = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        Integer[] copiaArray1 = Arrays.copyOf(array, 5);
        Integer[] copiaArray2 = Arrays.copyOfRange(array, 2, 6);
        System.out.println(Arrays.toString(copiaArray1));
        System.out.println(Arrays.toString(copiaArray2));
    }
    
}
