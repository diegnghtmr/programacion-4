import java.util.Arrays;

public class ejercicio2 {
    private static Integer[] array = {1, 2, 6, 8, 9, 3, 5};
    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 5);
        System.out.println(index);
    }
}
