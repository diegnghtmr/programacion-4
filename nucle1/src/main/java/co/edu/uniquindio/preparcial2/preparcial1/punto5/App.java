public class App{
    public static void main(String[] args) {
        String p1 = "(6-7)/4]";
        String p2 = "[(1+2)*4]+5";

        System.out.println(estaCorrecto(p1));
        System.out.println(estaCorrecto(p2));
    }

    public static boolean estaCorrecto(String cadena) {
        if (cadena.length() == 0) return false;

        Pila<Character> pila = new Pila<>();
        for(int i = 0; i<cadena.length(); i++) {
            char valor = cadena.charAt(i);

            if (valor == '(' || valor == '[' || valor == '{') {
                pila.apilar(valor);
            }

            else if(valor == ')' || valor == ']' || valor == '}') {
                if (pila.estaVacia()) return false;

                char tope = pila.desapilar();
                if (!estaCompleto(tope, valor)) return false;
            } 
        }
        return pila.estaVacia();
    }

    public static boolean estaCompleto(char abre, char cierra) {
        return (abre == '(' && cierra == ')') 
            || (abre == '[' && cierra == ']') 
            || (abre == '{' && cierra == '}');
    }
}
