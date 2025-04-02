public class App1 {
    public static void main(String[] args) {
        String infijo = "(7+8)/(3+2)";
        System.out.println("Expresión infija: " + infijo);

        String postfijo = InfijoAPostfijoEvaluador.convertirInfijoAPostfijo(infijo);
        System.out.println("Expresión postfija: " + postfijo);

        double resultado = InfijoAPostfijoEvaluador.evaluarPostfijo(postfijo);
        System.out.println("Resultado de la evaluación: " + resultado);
    }
}

