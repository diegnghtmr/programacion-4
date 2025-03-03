import java.io.ObjectOutputStream.PutField;
import java.util.ArrayDeque;

public class Pila<T>{

    private ArrayDeque<T> pila;
    private ComparadorPorClase comparador;

    public Pila() {
        pila = new ArrayDeque<>();
        comparador = new ComparadorPorClase();
    }

    public void agregarValorPila(T object) {
        if (pila.size() == 0) {
            pila.push(object);
        } else if (comparador.compare(object, pila.getLast()) == 0) {
            pila.push(object);
        } else {
            System.out.println("No son del mismo tipo");
        }
    }

    public void mostrarPila() {
        for (T p: pila) {
            System.out.println(p);
        }
    }

}
