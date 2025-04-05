import java.util.HashMap;

public class MainExpresionesAritmeticas {

    public static void main(String[] args) {
        String infija = "(A+B)*(C-D)";

        String postfija = infijaAPostfija(infija);
        String prefija = infijaAPrefija(infija);
        String prefijaDirecta = infijaAPrefijaDirecta(infija);

        System.out.println("Infija:   " + infija); 
        System.out.println("Postfija: " + postfija); 
        System.out.println("Prefija:  " + prefija); 
        System.out.println("PrefijaDirecta:  " + prefijaDirecta); 


        HashMap<Character, Integer> valores = new HashMap<>();
        valores.put('A', 5);
        valores.put('B', 3);
        valores.put('C', 10);
        valores.put('D', 2);

        int resultado = evaluarPostfijaConVariables(postfija, valores);
        System.out.println("Resultado postfija evaluada: " + resultado); 
    }

    public static String infijaAPrefija(String expresion) {
        StringBuilder exp = new StringBuilder(expresion).reverse();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                exp.setCharAt(i, ')');
            } else if (exp.charAt(i) == ')') {
                exp.setCharAt(i, '(');
            }
        }

        String postfija = infijaAPostfija(exp.toString());

        return new StringBuilder(postfija).reverse().toString();
    }


    public static String infijaAPrefijaDirecta(String expresion) {
        Pila<String> operandos = new Pila<>(); 
        Pila<Character> operadores = new Pila<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == ' ') continue;

            if (Character.isLetterOrDigit(c)) {
                operandos.apilar(String.valueOf(c));
            }

            else if (c == '(') {
                operadores.apilar(c);
            }

            else if (c == ')') {
                while (!operadores.estaVacia() && operadores.peek() != '(') {
                    combinarOperadores(operandos, operadores.desapilar());
                }
                operadores.desapilar(); 
            }

            else if (esOperador(c)) {
                while (!operadores.estaVacia() && precedencia(operadores.peek()) >= precedencia(c)) {
                    combinarOperadores(operandos, operadores.desapilar());
                }
                operadores.apilar(c); 
            }
        }

        while (!operadores.estaVacia()) {
            combinarOperadores(operandos, operadores.desapilar());
        }

        return operandos.desapilar();
    }

    private static void combinarOperadores(Pila<String> operandos, char operador) {
        String op2 = operandos.desapilar();
        String op1 = operandos.desapilar();
        String expresion = operador + op1 + op2;
        operandos.apilar(expresion);
    }


    public static String infijaAPostfija(String expresion) {
        StringBuilder resultado = new StringBuilder();  
        Pila<Character> pila = new Pila<>();          

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                resultado.append(c);
            }

            else if (c == '(') {
                pila.apilar(c);
            }

            else if (c == ')') {
                while (!pila.estaVacia() && pila.peek() != '(') {
                    resultado.append(pila.desapilar()); 
                }
                pila.desapilar(); 
            }

            else if (esOperador(c)) {
                while (!pila.estaVacia() && precedencia(c) <= precedencia(pila.peek())) {
                    resultado.append(pila.desapilar());
                }
                pila.apilar(c); 
            }
        }

        while (!pila.estaVacia()) {
            resultado.append(pila.desapilar());
        }

        return resultado.toString();
    }


    public static int precedencia(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }


    public static int evaluarPostfijaConVariables(String expresionPostfija, HashMap<Character, Integer> valores) {
        Pila<Integer> pila = new Pila<>(); 

        for (int i = 0; i < expresionPostfija.length(); i++) {
            char token = expresionPostfija.charAt(i);

            if (Character.isLetter(token)) {
                if (!valores.containsKey(token)) {
                    throw new IllegalArgumentException("Falta valor para la variable: " + token);
                }
                pila.apilar(valores.get(token));
            }

            else if (esOperador(token)) {
                int b = pila.desapilar();
                int a = pila.desapilar();

                switch (token) {
                    case '+':
                        pila.apilar(a + b);
                        break;
                    case '-':
                        pila.apilar(a - b);
                        break;
                    case '*':
                        pila.apilar(a * b);
                        break;
                    case '/':
                        pila.apilar(a / b);
                        break;
                    case '^':
                        pila.apilar((int) Math.pow(a, b));
                        break;
                }
            }
        }

        return pila.desapilar();
    }
}
