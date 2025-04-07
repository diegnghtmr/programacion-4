public class ConcatenacionPilas{

    public static <T> Pila<T> concatenarPilas(Pila<T> p1, Pila<T> p2) {
        Pila<T> resultado = new Pila<T>();
        Pila<T> auxiliar = new Pila<T>();

        while(!p1.estaVacia()) {
            auxiliar.apilar(p1.desapilar());
        }
        while(!auxiliar.estaVacia()) {
            resultado.apilar(auxiliar.desapilar());
        }

        while(!p2.estaVacia()) {
            auxiliar.apilar(p2.desapilar());
        }

        while(!auxiliar.estaVacia()){
            resultado.apilar(auxiliar.desapilar());
        }


        return resultado;
    }

    
}
