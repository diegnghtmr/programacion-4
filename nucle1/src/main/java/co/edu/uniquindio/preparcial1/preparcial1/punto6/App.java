
public class App {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(multiplicacionR(valores));
    }

    public static int multiplicacionR(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int medio = array.length/2;

        int[] izq = new int[medio];
        System.arraycopy(array, 0, izq, 0, medio);

        int[] der = new int[array.length-medio];
        System.arraycopy(array, medio, der, 0, array.length-medio);

        int multiplicacionIzq = multiplicacionR(izq);
        int multiplicacionDer = multiplicacionR(der);

        int multiplicacion = multiplicacionIzq*multiplicacionDer;
        return multiplicacion;
    }
    
}
