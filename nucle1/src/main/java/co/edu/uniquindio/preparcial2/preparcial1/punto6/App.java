public class App{
    public static void main(String[] args) {
        Pila<Integer> p1 = new Pila<>();
        p1.apilar(2);
        p1.apilar(3);
        p1.apilar(2);
        p1.apilar(4);
        p1.apilar(4);
        p1.apilar(5);

        Pila<Integer> pp = new Pila<>();
        pp.apilar(2);
        pp.apilar(3);
        pp.apilar(2);
        pp.apilar(4);
        pp.apilar(4);
        pp.apilar(5);
        while(!pp.estaVacia()){
            System.out.println(pp.desapilar());
        }

        System.out.println();

        Pila<Integer> p2 = removeDuplicates(p1);
        while(!p2.estaVacia()){
            System.out.println(p2.desapilar());
        }
    }

    public static <T extends Comparable<T>> Pila<T> removeDuplicates(Pila<T> p) {
        Pila<T> resultado = new Pila<>();
        ListaSimplementeEnlazada<T> aux = new ListaSimplementeEnlazada<>();
        while(!p.estaVacia()) {
            T dato = p.desapilar();
            Nodo<T> recorrerNodo = aux.getInicial();
            boolean agregar = true;
            for(int i = 0; i<aux.getTamanio(); i++){
                if (recorrerNodo.getDato().equals(dato)) {
                    agregar = false;
                }
                recorrerNodo = recorrerNodo.getSiguiente();
            }

            if(agregar){
                aux.agregarInicio(dato);
            }
        }

        Nodo<T> recorrerNodo = aux.getInicial();
        for(int i = 0; i<aux.getTamanio(); i++){
            resultado.apilar(recorrerNodo.getDato());
            recorrerNodo = recorrerNodo.getSiguiente();
        }
        return resultado;
    }
}
