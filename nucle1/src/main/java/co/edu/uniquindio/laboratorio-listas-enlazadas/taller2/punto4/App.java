public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        
        lista.agregarFinal(2);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(5);
        lista.agregarFinal(6);
        lista.agregarFinal(7);
        lista.agregarFinal(8);
        lista.agregarFinal(9);
        
        System.out.println("Lista original:");
        System.out.println(lista.mostrar());
        
        ListaSimplementeEnlazada<Integer> impares = lista.obtenerListaNumerosImpares();
        
        System.out.println("\nLista con los valores impares:");
        System.out.println(impares.mostrar());
    }
}

