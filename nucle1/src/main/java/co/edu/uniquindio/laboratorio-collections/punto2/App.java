public class App {

    public static void main(String[] args) {
        Pila pila = new Pila();

        Object1 o1 = new Object1();
        Object2 o2 = new Object2();
        Object1 o11 = new Object1();

        pila.agregarValorPila(o1);
        System.out.println(pila);
        pila.agregarValorPila(o2);
        pila.agregarValorPila(o11);

        pila.mostrarPila();
    }
}
