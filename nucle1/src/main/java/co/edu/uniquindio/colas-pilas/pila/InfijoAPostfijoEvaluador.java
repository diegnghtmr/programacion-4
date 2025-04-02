public class InfijoAPostfijoEvaluador {
    public static String convertirInfijoAPostfijo(String infijo) {
        Pila<Character> pila = new Pila<>();
        StringBuilder postfijo = new StringBuilder();

        for (int i = 0; i < infijo.length(); i++) {
            char c = infijo.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;
            }

            if (Character.isDigit(c)) {
                postfijo.append(c).append(" ");
            }
            else if (c == '(') {
                pila.apilar(c);
            }
            else if (c == ')') {
                while (!pila.estaVacia() && pila.peek() != '(') {
                    postfijo.append(pila.desapilar()).append(" ");
                }
                if (!pila.estaVacia() && pila.peek() == '(') {
                    pila.desapilar();
                }
            }
            else if (esOperador(c)) {
                while (!pila.estaVacia() && pila.peek() != '(' &&
                        (
                          (!esAsociativoDerecho(c) && precedencia(pila.peek()) >= precedencia(c)) ||
                          (esAsociativoDerecho(c) && precedencia(pila.peek()) > precedencia(c))
                        )
                      ) {
                    postfijo.append(pila.desapilar()).append(" ");
                }
                pila.apilar(c);
            }
        }

        while (!pila.estaVacia()) {
            char op = pila.desapilar();
            if (op != '(') {
                postfijo.append(op).append(" ");
            }
        }

        return postfijo.toString().trim();
    }

    public static double evaluarPostfijo(String postfijo) {
        Pila<Double> pila = new Pila<>();
        String[] tokens = postfijo.split("\\s+");

        for (String token : tokens) {
            if (esNumero(token)) {
                pila.apilar(Double.parseDouble(token));
            }
            else if (token.length() == 1 && esOperador(token.charAt(0))) {
                double b = pila.desapilar();
                double a = pila.desapilar();
                double resultado = operar(a, b, token.charAt(0));
                pila.apilar(resultado);
            }
        }

        return pila.desapilar();
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int precedencia(char op) {
        switch (op) {
            case '^': return 3;
            case '*': 
            case '/': return 2;
            case '+': 
            case '-': return 1;
            default: return 0;
        }
    }

    private static boolean esAsociativoDerecho(char op) {
        return op == '^';
    }

    private static double operar(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return a / b;
            case '^': return Math.pow(a, b);
            default:
                throw new RuntimeException("Operador desconocido: " + op);
        }
    }

    private static boolean esNumero(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

