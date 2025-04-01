public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarFinal(4);
        lista.agregarFinal(1);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(7);
        lista.agregarFinal(4);
        lista.agregarFinal(9);

        int maxDist = lista.maximaDistancia(4);
        System.out.println("Máxima distancia: " + maxDist);
    }
}
