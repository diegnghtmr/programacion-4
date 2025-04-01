import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";

        ListaSimplementeEnlazada<Double> listaNumeros = new ListaSimplementeEnlazada<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                double valor = Double.parseDouble(linea);
                listaNumeros.agregarFinal(valor);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de un número: " + e.getMessage());
            return;
        }

        int n = listaNumeros.getTamanio();
        if (n == 0) {
            System.out.println("La lista está vacía. No hay datos para procesar.");
            return;
        }

        double suma = listaNumeros.sumarElementos();
        double media = suma / n;

        double sumatoriaCuadrados = 0.0;
        for (int i = 0; i < n; i++) {
            double xi = listaNumeros.obtenerValor(i);
            sumatoriaCuadrados += Math.pow((xi - media), 2);
        }
        double varianza = sumatoriaCuadrados / (n - 1);
        double desviacionEstandar = Math.sqrt(varianza);

        System.out.println("Cantidad de datos: " + n);
        System.out.println("Media (promedio):  " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }
}

