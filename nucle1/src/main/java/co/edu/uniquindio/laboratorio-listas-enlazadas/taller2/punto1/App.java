public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        lista.agregarFinal(40);
        lista.agregarFinal(50);

        System.out.println("Lista original:");
        System.out.println(lista.mostrar());

        ListaSimplementeEnlazada<Integer> listaImpares = lista.obtenerPosicionesImpares();

        System.out.println("Elementos en posiciones impares:");
        System.out.println(listaImpares.mostrar());
    }
}

