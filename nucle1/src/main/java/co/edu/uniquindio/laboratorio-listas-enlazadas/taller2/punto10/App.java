public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> lista1 = new ListaSimplementeEnlazada<>();
        lista1.agregarFinal(1);
        lista1.agregarFinal(3);
        lista1.agregarFinal(5);

        ListaSimplementeEnlazada<Integer> lista2 = new ListaSimplementeEnlazada<>();
        lista2.agregarFinal(2);
        lista2.agregarFinal(4);
        lista2.agregarFinal(6);

        System.out.println("Lista 1: " + lista1.mostrar());
        System.out.println("Lista 2: " + lista2.mostrar());

        ListaSimplementeEnlazada<Integer> listaConcatenada = 
                ListaSimplementeEnlazada.concatenar(lista1, lista2);

        System.out.println("Lista concatenada: " + listaConcatenada.mostrar());
    }
}

