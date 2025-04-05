public class Palindromo {
    
    public static boolean esPalindromo(String palabra) {
        String vieja = palabra.toLowerCase();
        StringBuilder nueva = new StringBuilder();
        Pila<Character> pila = new Pila<>();
        for (int i = 0; i<vieja.length(); i++) {
            pila.apilar(vieja.charAt(i));
        }
        while(!pila.estaVacia()) {
            nueva.append(pila.desapilar());
        }

        if (vieja.equals(nueva.toString())) {
            return true;
        }
        return false;
    }

}
