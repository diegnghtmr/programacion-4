public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();

        lista.agregarFinal(2);
        lista.agregarFinal(8);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(5);
        lista.agregarFinal(6);
        lista.agregarFinal(7);
        lista.agregarFinal(8);

        System.out.println("Lista original:");
        System.out.println(lista.mostrar());

        lista.eliminarNumerosPares();

        System.out.println("\nLista después de eliminar los números pares:");
        System.out.println(lista.mostrar());
    }
}

