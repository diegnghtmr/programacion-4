public class App{
    public static void main(String[] args) {
        Pila<Integer> p = new Pila<>();
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(3);
        p.apilar(5);
        eliminarElemento(p,3);
        while(!p.estaVacia()) {
            System.out.println(p.desapilar());
        }
    }

    public static <T> void eliminarElemento(Pila<T> pila, T valor) {
        Pila<T> aux = new Pila<>();
        Boolean elimando = false;
        while(!pila.estaVacia()){
            T dato = pila.desapilar();
            if(!elimando && dato.equals(valor)){
                elimando = true;
            } else{
                aux.apilar(dato);
            }
        }
        while(!aux.estaVacia()) {
            pila.apilar(aux.desapilar());
        }
    }
}
