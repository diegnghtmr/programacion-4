public class App{
    public static void main(String[] args) {
        ListaSimplementeEnlazada<Integer> numeros = new ListaSimplementeEnlazada<>();
        numeros.agregarFinal(1);
        numeros.agregarFinal(2);
        numeros.agregarFinal(3);
        System.out.println(numeros.mostrar());
        ListaSimplementeEnlazada newNumeros = invertirLista(numeros);
        System.out.println(newNumeros.mostrar());
    }

    public static <T extends Comparable<T>> ListaSimplementeEnlazada<T> invertirLista(ListaSimplementeEnlazada<T> lista) {
        Pila<T> pila = new Pila<>();
        while(lista.getInicial() != null) {
            pila.apilar(lista.getInicial().getDato());
            lista.eliminar(lista.getInicial().getDato());
        }

        while(!pila.estaVacia()){
            lista.agregarFinal(pila.desapilar());
        }

        return lista;
    }
}
