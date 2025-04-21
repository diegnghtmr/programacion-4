public class App{
    public static void main(String[] args) {
        Pila<Integer> p = new Pila<>();
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        p.apilar(6);
        p.apilar(7);
        p.apilar(8);
        p.apilar(11);

        Cola<Integer> c = retornarPrimos(p);
        while (!c.estaVacia()){
            System.out.println(c.peek());
            c.desencolar();
        }

    }

    public static <T extends Integer> Cola<T> retornarPrimos(Pila<T> pila){
        Pila<T> aux = new Pila<>();
        while(!pila.estaVacia()) {
            aux.apilar(pila.desapilar());
        }

        Cola<T> cola = new Cola<>();
        while(!aux.estaVacia()) {
            T valor = aux.desapilar();
            if (esPrimo(valor)) {
                cola.encolar(valor);
            }
            pila.apilar(valor);
        }
        return cola;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        int limite = (int) Math.sqrt(n);
        for (int i = 2; i <= limite; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
