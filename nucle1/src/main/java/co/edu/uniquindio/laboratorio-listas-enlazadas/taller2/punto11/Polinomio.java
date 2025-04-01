public class Polinomio {
    private NodoPolinomio inicio;

    public Polinomio() {
        this.inicio = null;
    }


    public void agregarTermino(double coef, int exp) {
        NodoPolinomio nuevo = new NodoPolinomio(coef, exp);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoPolinomio actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }


    public String mostrarPolinomio() {
        if (inicio == null) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        NodoPolinomio actual = inicio;

        while (actual != null) {
            double c = actual.coeficiente;
            int e = actual.exponente;

            if (e == 0) {
                sb.append(c);
            } else if (e == 1) {
                sb.append(c).append("x");
            } else {
                sb.append(c).append("x^").append(e);
            }

            actual = actual.siguiente;
            if (actual != null) {
                if (actual.coeficiente >= 0) {
                    sb.append(" + ");
                } else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }


    public double evaluar(double x) {
        double resultado = 0.0;
        NodoPolinomio actual = inicio;
        while (actual != null) {
            double c = actual.coeficiente;
            int e = actual.exponente;
            resultado += c * Math.pow(x, e);
            actual = actual.siguiente;
        }
        return resultado;
    }
}

