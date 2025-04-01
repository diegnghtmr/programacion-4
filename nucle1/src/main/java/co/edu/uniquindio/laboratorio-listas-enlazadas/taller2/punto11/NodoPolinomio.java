public class NodoPolinomio {
    double coeficiente;
    int exponente;
    NodoPolinomio siguiente;

    public NodoPolinomio(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }
}

