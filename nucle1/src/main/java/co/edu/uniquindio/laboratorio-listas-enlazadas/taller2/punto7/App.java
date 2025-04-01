public class App {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();

        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        lista.agregarFinal(40);
        lista.agregarFinal(50);

        System.out.println("Elementos de la lista (usando Iterator):");
        for (Integer num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

