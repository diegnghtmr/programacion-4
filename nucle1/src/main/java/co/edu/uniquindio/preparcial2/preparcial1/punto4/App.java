public class App{
    public static void main(String[] args) {
        int n = 61;
        int binComoEntero = decimalToBinario(n);
        System.out.println(binComoEntero);
    }

    public static int decimalToBinario(int decimal) {
        if (decimal <= 0) return 0;

        Pila<Integer> pila = new Pila<>();
        while(decimal>0){
            pila.apilar(decimal%2);
            decimal /=2;
        }

        StringBuilder sb = new StringBuilder();
        while(!pila.estaVacia()){
            sb.append(pila.desapilar());
        }

        return Integer.parseInt(sb.toString());
    }
}
