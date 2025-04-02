public class App2 {
    public static void main(String[] args) {
        String infijo = "2^3+4";
        System.out.println("Expresión infija: " + infijo);

        String postfijo = InfijoAPostfijoEvaluador.convertirInfijoAPostfijo(infijo);
        System.out.println("Expresión postfija: " + postfijo);

        double resultado = InfijoAPostfijoEvaluador.evaluarPostfijo(postfijo);
        System.out.println("Resultado de la evaluación: " + resultado);
    }
}

