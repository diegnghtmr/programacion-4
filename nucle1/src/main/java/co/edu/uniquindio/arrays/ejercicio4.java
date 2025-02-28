import java.util.Arrays;

public class ejercicio4 {
    private static Integer[] array1 = {1,2,2};
    private static Integer[] array2 = {1,2,2};
    public static void main(String[] args) {
        boolean v1 = Arrays.equals(array1, array2);
        System.out.println(v1);
        array1[2] = 3;
        boolean v2 = Arrays.equals(array1, array2);
        System.out.println(v2);
    }
}
