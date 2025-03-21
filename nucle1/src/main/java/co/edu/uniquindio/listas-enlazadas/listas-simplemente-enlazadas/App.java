public class App {
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> miLista = new ListaSimplementeEnlazada<Integer>();

        miLista.agregarInicio(10);
        miLista.agregarInicio(20);
        System.out.println(miLista.mostrar());

        miLista.agregarFinal(30);
        miLista.agregarFinal(40);
        System.out.println(miLista.mostrar());
        
        ListaSimplementeEnlazada<String> miLista2 = new ListaSimplementeEnlazada<>();

        miLista2.agregarInicio("sara");
        miLista2.agregarInicio("sarita");
        System.out.println(miLista2.mostrar());

        miLista2.agregarFinal("holaa");
        miLista2.agregarFinal("adio");
        System.out.println(miLista2.mostrar());

        miLista2.eliminar("sarita");
        System.out.println(miLista2.obtener("sara"));
        System.out.println(miLista2.obtener("ola"));
        System.out.println(miLista2.localizar("pepito"));
        System.out.println(miLista2.localizar("sara"));
        System.out.println(miLista2.mostrar());
    }
}
