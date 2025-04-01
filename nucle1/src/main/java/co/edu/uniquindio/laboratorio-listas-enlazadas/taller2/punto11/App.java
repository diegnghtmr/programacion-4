public class App {
    public static void main(String[] args) {
        Polinomio p = new Polinomio();

        p.agregarTermino(3, 4);   
        p.agregarTermino(-4, 2);  
        p.agregarTermino(11, 0); 

        System.out.println("Polinomio: " + p.mostrarPolinomio());

        double[] valoresX = {0.0, 0.5, 1.0, 2.5, 5.0};

        System.out.println("\nTabla de valores:");
        System.out.println(" x\t| P(x)");
        System.out.println("---------------");

        for (double x : valoresX) {
            double valor = p.evaluar(x);
            System.out.println(" " + x + "\t| " + valor);
        }
    }
}

