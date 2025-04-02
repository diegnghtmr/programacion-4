public class App {
    public static void main(String[] args) {
        BigCola<Integer> bicola = new BigCola<>();

        bicola.encolarIzquierda(10);  
        bicola.encolarDerecha(20);  
        bicola.encolarIzquierda(5);  
        bicola.encolarDerecha(30);   

        System.out.println("Tamaño de la bicola: " + bicola.getTamanio());
        System.out.println("Elemento izquierdo: " + bicola.peekIzquierda());
        System.out.println("Elemento derecho: " + bicola.peekDerecha());

        bicola.desencolarIzquierda();
        System.out.println("\nDespués de desencolar izquierda:");
        System.out.println("Elemento izquierdo: " + bicola.peekIzquierda());
        System.out.println("Tamaño: " + bicola.getTamanio());

        bicola.desencolarDerecha();
        System.out.println("\nDespués de desencolar derecha:");
        System.out.println("Elemento derecho: " + bicola.peekDerecha());
        System.out.println("Tamaño: " + bicola.getTamanio());
    }
}

