public class App {
    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada<Integer> miLista = new ListaCircularSimplementeEnlazada<>();
        miLista.agregarInicio(10);
        miLista.agregarFinal(2);
        System.out.println(miLista.mostrar());
        miLista.agregarAntes(2, 1);
        System.out.println(miLista.mostrar());
        miLista.agregarDespues(2, 3);
        System.out.println(miLista.mostrar());

        miLista.eliminar(2);
        System.out.println(miLista.mostrar());

        System.out.println(miLista.obtener(2));
        System.out.println(miLista.obtener(3));
        System.out.println(miLista.localizar(10));
        System.out.println(miLista.localizar(11));





    }
    
}
