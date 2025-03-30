public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();

        lista.agregarFinal(5);
        lista.agregarFinal(3);
        lista.agregarFinal(5);
        lista.agregarFinal(7);
        lista.agregarFinal(5);
        lista.agregarFinal(2);

        System.out.println("Lista: ");
        System.out.println(lista.mostrar());

        int repeticiones = lista.contarOcurrencias(5);
        System.out.println("\nEl valor 5 se repite " + repeticiones + " veces.");
    }
}

