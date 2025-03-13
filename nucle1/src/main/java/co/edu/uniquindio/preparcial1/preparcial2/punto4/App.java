import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);

        numeros.add(2);

        numeros.add(3);

        System.out.println("Suma de enteros: " + suma(numeros));



        ArrayList<Double> decimales = new ArrayList<>();

        decimales.add(1.5);

        decimales.add(2.7);

        decimales.add(3.2);

        System.out.println("Suma de decimales: " + suma(decimales));

    }

    public static double suma(Collection<? extends Number> numeros) {
        if (numeros.size() == 0 || numeros == null ) {
            return 0.0;
        }
        double valor  = 0.0;
        for (Number number : numeros) {
            valor += number.doubleValue();
        }
        return valor;
    }
    
}
