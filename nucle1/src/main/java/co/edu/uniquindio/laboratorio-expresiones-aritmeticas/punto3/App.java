public class App {
    public static void main(String[] args) {
        Pila<Integer> antonio = new Pila<>();
        antonio.apilar(1);
        antonio.apilar(2);

        Pila<Integer> mono = new Pila<>();
        mono.apilar(3);
        mono.apilar(4);

        Pila<Integer> resultado = ConcatenacionPilas.concatenarPilas(antonio, mono);
        
        while(!resultado.estaVacia()) {
            System.out.println(resultado.desapilar());
        }
    }
}
